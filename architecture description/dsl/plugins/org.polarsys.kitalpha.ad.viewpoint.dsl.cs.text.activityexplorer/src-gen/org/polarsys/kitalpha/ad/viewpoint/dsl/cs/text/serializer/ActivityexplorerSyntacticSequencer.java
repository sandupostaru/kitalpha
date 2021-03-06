/*
 * generated by Xtext
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

@SuppressWarnings("all")
public class ActivityexplorerSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ActivityexplorerGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q;
	protected AbstractElementAlias match_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q;
	protected AbstractElementAlias match_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q;
	protected AbstractElementAlias match_ViewpointActivityExplorer___PagesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ActivityexplorerGrammarAccess) access;
		match_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPageAccess().getHeaderKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4()));
		match_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPageAccess().getSectionsKeyword_15_0()), new TokenAlias(false, false, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3()));
		match_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSectionAccess().getActivitiesKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3()));
		match_ViewpointActivityExplorer___PagesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_4_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q.equals(syntax))
				emit_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q.equals(syntax))
				emit_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q.equals(syntax))
				emit_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ViewpointActivityExplorer___PagesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ViewpointActivityExplorer___PagesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('header' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     index=EInt (ambiguity) 'predicated' ':' hasPredicate=EBoolean
	 *     index=EInt (ambiguity) 'sections' '{' ownedSections+=Section
	 *     index=EInt (ambiguity) 'show-viewer' ':' showViewer=EBoolean
	 *     index=EInt (ambiguity) 'tab-name' tabName=STRING
	 *     index=EInt (ambiguity) ('sections' '{' '}')? '}' (rule end)
	 *     ownedOverview=Overview (ambiguity) 'predicated' ':' hasPredicate=EBoolean
	 *     ownedOverview=Overview (ambiguity) 'sections' '{' ownedSections+=Section
	 *     ownedOverview=Overview (ambiguity) 'show-viewer' ':' showViewer=EBoolean
	 *     ownedOverview=Overview (ambiguity) 'tab-name' tabName=STRING
	 *     ownedOverview=Overview (ambiguity) ('sections' '{' '}')? '}' (rule end)
	 */
	protected void emit_Page___HeaderKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('sections' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     hasPredicate=EBoolean (ambiguity) '}' (rule end)
	 *     imagePathOff=STRING '}' (ambiguity) '}' (rule end)
	 *     imagePathOn=STRING '}' (ambiguity) '}' (rule end)
	 *     index=EInt ('header' '{' '}')? (ambiguity) '}' (rule end)
	 *     ownedOverview=Overview ('header' '{' '}')? (ambiguity) '}' (rule end)
	 *     showViewer=EBoolean (ambiguity) '}' (rule end)
	 *     tabName=STRING (ambiguity) '}' (rule end)
	 */
	protected void emit_Page___SectionsKeyword_15_0_LeftCurlyBracketKeyword_15_1_RightCurlyBracketKeyword_15_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('activities' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     expanded=EBoolean (ambiguity) '}' (rule end)
	 *     filtering=EBoolean (ambiguity) '}' (rule end)
	 *     index=EInt (ambiguity) '}' (rule end)
	 */
	protected void emit_Section___ActivitiesKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('pages' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=FQN '{' (ambiguity) '}' (rule end)
	 *     name=FQN '{' (ambiguity) ownedPages+=PageExtension
	 *     name=FQN '{' (ambiguity) ownedSectionExtensions+=SectionExtension
	 */
	protected void emit_ViewpointActivityExplorer___PagesKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
