/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.internal;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditor;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditorInput;
import org.polarsys.kitalpha.richtext.widget.helper.MDERichtextWidgetHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class RichtextEditorResourceSetListener extends ResourceSetListenerImpl implements ResourceSetListener {

  public RichtextEditorResourceSetListener() {
    // Do nothing
  }

  @Override
  public void resourceSetChanged(ResourceSetChangeEvent event) {
    super.resourceSetChanged(event);

    List<Notification> notifications = event.getNotifications();

    // Close dangling editors if there are REMOVE/REMOVE_MANY notifications
    if (notifications.stream().anyMatch(notification -> (notification.getEventType() == Notification.REMOVE
        || notification.getEventType() == Notification.REMOVE_MANY))) {
      MDERichtextWidgetHelper.getActiveMDERichTextEditors().stream()
          .forEach(editor -> handleClosingEditors(editor, event.getEditingDomain()));
    }

    // Update editors' titles if there are SET notifications
    notifications.stream().filter(notification -> (notification.getEventType() == Notification.SET))
        .forEach(this::updateEditorsTitle);
  }

  @Override
  public NotificationFilter getFilter() {
    return NotificationFilter.createEventTypeFilter(Notification.REMOVE)
        .or(NotificationFilter.createEventTypeFilter(Notification.REMOVE_MANY))
        .or(NotificationFilter.createEventTypeFilter(Notification.SET));
  }

  @Override
  public boolean isPostcommitOnly() {
    return true;
  }

  private void close(MDERichTextEditor richtextEditor) {
    if (richtextEditor != null) {
      Display.getDefault().asyncExec(() -> richtextEditor.getEditorSite().getPage().closeEditor(richtextEditor, false));
    }
  }

  private void handleClosingEditors(MDERichTextEditor richtextEditor, TransactionalEditingDomain editingDomain) {
    MDERichTextEditorInput editorInput;
    editorInput = (MDERichTextEditorInput) richtextEditor.getEditorInput();
    EObject element = editorInput.getElement();
    TransactionalEditingDomain eltEditingDomain = TransactionUtil.getEditingDomain(element);
    /*
     * If the editing domain of element is null or we are in the same editing domain and the resource of the element is
     * null => Close the editor
     */
    if ((eltEditingDomain == null || eltEditingDomain == editingDomain) && element.eResource() == null) {
      close(richtextEditor);
    }
  }

  private List<EStructuralFeature> getContributedTitleChangingFeatures() {
    return MDERichtextWidgetHelper.getInstance().getEditorInputFeatureContribution().stream()
        .flatMap(contribution -> contribution.getTitleChangingFeatures().stream()).collect(Collectors.toList());
  }

  private void updateEditorsTitle(Notification notification) {
    if (getContributedTitleChangingFeatures().contains(notification.getFeature())) {
      for (MDERichTextEditor richtextEditor : MDERichtextWidgetHelper.getActiveMDERichTextEditors()) {
        MDERichTextEditorInput input = (MDERichTextEditorInput) richtextEditor.getEditorInput();
        EObject element = input.getElement();
        if (element == notification.getNotifier()) {
          richtextEditor.setMDERichTextEditorPartName();
        }
      }
    }
  }

}
