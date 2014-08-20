/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
//Generated with EGF 1.2.0.v20140805-0859
package org.polarsys.kitalpha.doc.gen.business.core.index;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.core.branding.DocumentationBrandingData;
import java.text.SimpleDateFormat;

public class FooterBuilder
		extends
		org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized FooterBuilder create(String lineSeparator) {
		nl = lineSeparator;
		FooterBuilder result = new FooterBuilder();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\""
			+ NL
			+ "   \"http://www.w3.org/TR/html4/frameset.dtd\">"
			+ NL
			+ "<html>" + NL + "<head>" + NL + "<title>";
	protected final String TEXT_2 = "</title>" + NL + "</head>";
	protected final String TEXT_3 = "</html>";
	protected final String TEXT_4 = NL
			+ "<body style=\"background-color:#DDE0E3; margin:0px; padding:0px;\">"
			+ NL + "<p " + NL + "\tstyle=\"color:#000000; " + NL
			+ "\ttext-align:center; " + NL + "\tmargin:0px; " + NL
			+ "\tpadding:0px; " + NL + "\tmargin-top:5px; " + NL
			+ "\tfont-family: Arial, sans-serif; " + NL + "\tfont-size:12px\">"
			+ NL + "\t";
	protected final String TEXT_5 = NL + "</p>" + NL + "<p " + NL
			+ "\tstyle=\"color:#000000; " + NL + "\ttext-align: right; " + NL
			+ "\tmargin:0px; " + NL + "\tpadding:0px; " + NL
			+ "\tmargin-top:5px; " + NL + "\tfont-family: Arial, sans-serif; "
			+ NL + "\tfont-size:9px\">" + NL
			+ "\t<span style=\"display:block;float:left\">Page generated: ";
	protected final String TEXT_6 = " </span>"
			+ NL
			+ "\tGenerated by Docgen html from the <a href=\"https://www.polarsys.org/projects/polarsys.kitalpha\" target=\"_blank\"> Kitalpha </a> Project"
			+ NL + "</p>" + NL + "</body>";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;

	public FooterBuilder() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		if (preCondition(ctx)) {
			ctx.setNode(new Node.Container(currentNode, getClass()));
			orchestration(ctx);
		}

		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_7);
		stringBuffer.append(TEXT_8);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_setContext(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		title = "Index";
		fileName = "footer";

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext",
				stringBuffer.toString());
	}

	protected void method_docHeader(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		stringBuffer.append(title);
		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docHeader",
				stringBuffer.toString());
	}

	protected void method_docFooter(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_3);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docFooter",
				stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(
				"EEE, d MMM yyyy HH:mm:ss z");
		String genTime = sdf.format(cal.getTime());

		stringBuffer.append(TEXT_4);
		stringBuffer.append(DocumentationBrandingData.getInstance().getData(
				"copyright"));
		stringBuffer.append(TEXT_5);
		stringBuffer.append(genTime);
		stringBuffer.append(TEXT_6);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content",
				stringBuffer.toString());
	}

	protected void method_startContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "startContent",
				stringBuffer.toString());
	}

	protected void method_endContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "endContent",
				stringBuffer.toString());
	}
}