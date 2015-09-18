/*
* generated by Xtext
*/
grammar InternalActivityexplorer;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

}

@parser::members {

 	private ActivityexplorerGrammarAccess grammarAccess;
 	
    public InternalActivityexplorerParser(TokenStream input, ActivityexplorerGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ViewpointActivityExplorer";	
   	}
   	
   	@Override
   	protected ActivityexplorerGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleViewpointActivityExplorer
entryRuleViewpointActivityExplorer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getViewpointActivityExplorerRule()); }
	 iv_ruleViewpointActivityExplorer=ruleViewpointActivityExplorer 
	 { $current=$iv_ruleViewpointActivityExplorer.current; } 
	 EOF 
;

// Rule ViewpointActivityExplorer
ruleViewpointActivityExplorer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getViewpointActivityExplorerAccess().getViewpointActivityExplorerAction_0(),
            $current);
    }
)	otherlv_1='activity' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getViewpointActivityExplorerAccess().getActivityKeyword_1());
    }
	otherlv_2='explorer' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getViewpointActivityExplorerAccess().getExplorerKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getNameFQNParserRuleCall_3_0()); 
	    }
		lv_name_3_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_4());
    }
(	otherlv_5='pages' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getViewpointActivityExplorerAccess().getPagesKeyword_5_0());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getViewpointActivityExplorerAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageParserRuleCall_5_2_0()); 
	    }
		lv_ownedPages_7_0=rulePage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
	        }
       		add(
       			$current, 
       			"ownedPages",
        		lv_ownedPages_7_0, 
        		"Page");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_5_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedPagesPageExtensionParserRuleCall_6_0()); 
	    }
		lv_ownedPages_9_0=rulePageExtension		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
	        }
       		add(
       			$current, 
       			"ownedPages",
        		lv_ownedPages_9_0, 
        		"PageExtension");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionExtensionsSectionExtensionParserRuleCall_7_0()); 
	    }
		lv_ownedSectionExtensions_10_0=ruleSectionExtension		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointActivityExplorerRule());
	        }
       		add(
       			$current, 
       			"ownedSectionExtensions",
        		lv_ownedSectionExtensions_10_0, 
        		"SectionExtension");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getViewpointActivityExplorerAccess().getRightCurlyBracketKeyword_8());
    }
)
;







// Entry rule entryRulePage
entryRulePage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	 iv_rulePage=rulePage 
	 { $current=$iv_rulePage.current; } 
	 EOF 
;

// Rule Page
rulePage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPageAccess().getPageAction_0(),
            $current);
    }
)	otherlv_1='page' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='file' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getFileKeyword_5_0());
    }
	otherlv_7='extension' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getExtensionKeyword_5_1());
    }
(
(
		lv_fileExtensions_8_0=RULE_STRING
		{
			newLeafNode(lv_fileExtensions_8_0, grammarAccess.getPageAccess().getFileExtensionsSTRINGTerminalRuleCall_5_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"fileExtensions",
        		lv_fileExtensions_8_0, 
        		"STRING");
	    }

)
))?(	otherlv_9='id' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getPageAccess().getIdKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getActivityExplorerItemIDFQNParserRuleCall_6_1_0()); 
	    }
		lv_activityExplorerItemID_10_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		set(
       			$current, 
       			"activityExplorerItemID",
        		lv_activityExplorerItemID_10_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_11='label' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getPageAccess().getLabelKeyword_7_0());
    }
(
(
		lv_label_12_0=RULE_STRING
		{
			newLeafNode(lv_label_12_0, grammarAccess.getPageAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_12_0, 
        		"STRING");
	    }

)
))?	otherlv_13='index' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getIndexKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getIndexEIntParserRuleCall_9_0()); 
	    }
		lv_index_14_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		set(
       			$current, 
       			"index",
        		lv_index_14_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getOwnedOverviewOverviewParserRuleCall_10_0()); 
	    }
		lv_ownedOverview_15_0=ruleOverview		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		set(
       			$current, 
       			"ownedOverview",
        		lv_ownedOverview_15_0, 
        		"Overview");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_16='header' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getPageAccess().getHeaderKeyword_11_0());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_11_1());
    }
(	otherlv_18='image' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getPageAccess().getImageKeyword_11_2_0());
    }
	otherlv_19='on' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getPageAccess().getOnKeyword_11_2_1());
    }
	otherlv_20=':' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getPageAccess().getColonKeyword_11_2_2());
    }
(
(
		lv_imagePathOn_21_0=RULE_STRING
		{
			newLeafNode(lv_imagePathOn_21_0, grammarAccess.getPageAccess().getImagePathOnSTRINGTerminalRuleCall_11_2_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePathOn",
        		lv_imagePathOn_21_0, 
        		"STRING");
	    }

)
))?(	otherlv_22='image' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getPageAccess().getImageKeyword_11_3_0());
    }
	otherlv_23='off' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getPageAccess().getOffKeyword_11_3_1());
    }
	otherlv_24=':' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getPageAccess().getColonKeyword_11_3_2());
    }
(
(
		lv_imagePathOff_25_0=RULE_STRING
		{
			newLeafNode(lv_imagePathOff_25_0, grammarAccess.getPageAccess().getImagePathOffSTRINGTerminalRuleCall_11_3_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePathOff",
        		lv_imagePathOff_25_0, 
        		"STRING");
	    }

)
))?	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11_4());
    }
)?(	otherlv_27='tab' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getPageAccess().getTabKeyword_12_0());
    }
	otherlv_28='name' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getPageAccess().getNameKeyword_12_1());
    }
(
(
		lv_tabName_29_0=RULE_STRING
		{
			newLeafNode(lv_tabName_29_0, grammarAccess.getPageAccess().getTabNameSTRINGTerminalRuleCall_12_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"tabName",
        		lv_tabName_29_0, 
        		"STRING");
	    }

)
))?(	otherlv_30='predicated' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getPageAccess().getPredicatedKeyword_13_0());
    }
	otherlv_31=':' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getPageAccess().getColonKeyword_13_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getHasPredicateEBooleanParserRuleCall_13_2_0()); 
	    }
		lv_hasPredicate_32_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		set(
       			$current, 
       			"hasPredicate",
        		lv_hasPredicate_32_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_33='show' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getPageAccess().getShowKeyword_14_0());
    }
	otherlv_34='viewer' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getPageAccess().getViewerKeyword_14_1());
    }
	otherlv_35=':' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getPageAccess().getColonKeyword_14_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getShowViewerEBooleanParserRuleCall_14_3_0()); 
	    }
		lv_showViewer_36_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		set(
       			$current, 
       			"showViewer",
        		lv_showViewer_36_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_37='sections' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getPageAccess().getSectionsKeyword_15_0());
    }
	otherlv_38='{' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_15_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getOwnedSectionsSectionParserRuleCall_15_2_0()); 
	    }
		lv_ownedSections_39_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"ownedSections",
        		lv_ownedSections_39_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_40='}' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_15_3());
    }
)?	otherlv_41='}' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_16());
    }
)
;





// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	 iv_ruleSection=ruleSection 
	 { $current=$iv_ruleSection.current; } 
	 EOF 
;

// Rule Section
ruleSection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSectionAccess().getSectionAction_0(),
            $current);
    }
)	otherlv_1='section' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getSectionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='id' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getIdKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
	    }
		lv_activityExplorerItemID_7_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionRule());
	        }
       		set(
       			$current, 
       			"activityExplorerItemID",
        		lv_activityExplorerItemID_7_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8='label' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getLabelKeyword_6_0());
    }
(
(
		lv_label_9_0=RULE_STRING
		{
			newLeafNode(lv_label_9_0, grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_9_0, 
        		"STRING");
	    }

)
))?	otherlv_10='index' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getIndexKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionAccess().getIndexEIntParserRuleCall_8_0()); 
	    }
		lv_index_11_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionRule());
	        }
       		set(
       			$current, 
       			"index",
        		lv_index_11_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_12='filtering' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getFilteringKeyword_9_0());
    }
	otherlv_13=':' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getColonKeyword_9_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionAccess().getFilteringEBooleanParserRuleCall_9_2_0()); 
	    }
		lv_filtering_14_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionRule());
	        }
       		set(
       			$current, 
       			"filtering",
        		lv_filtering_14_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_15='expanded' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getExpandedKeyword_10_0());
    }
	otherlv_16=':' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getColonKeyword_10_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionAccess().getExpandedEBooleanParserRuleCall_10_2_0()); 
	    }
		lv_expanded_17_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionRule());
	        }
       		set(
       			$current, 
       			"expanded",
        		lv_expanded_17_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_18='activities' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getSectionAccess().getActivitiesKeyword_11_0());
    }
	otherlv_19='{' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_11_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionAccess().getOwnedActivitiesActivityParserRuleCall_11_2_0()); 
	    }
		lv_ownedActivities_20_0=ruleActivity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionRule());
	        }
       		add(
       			$current, 
       			"ownedActivities",
        		lv_ownedActivities_20_0, 
        		"Activity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_11_3());
    }
)?	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_12());
    }
)
;





// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActivityRule()); }
	 iv_ruleActivity=ruleActivity 
	 { $current=$iv_ruleActivity.current; } 
	 EOF 
;

// Rule Activity
ruleActivity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActivityAccess().getActivityAction_0(),
            $current);
    }
)	otherlv_1='activity' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(	otherlv_6='id' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getIdKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getActivityExplorerItemIDFQNParserRuleCall_5_1_0()); 
	    }
		lv_activityExplorerItemID_7_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"activityExplorerItemID",
        		lv_activityExplorerItemID_7_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8='label' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getLabelKeyword_6_0());
    }
(
(
		lv_label_9_0=RULE_STRING
		{
			newLeafNode(lv_label_9_0, grammarAccess.getActivityAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_9_0, 
        		"STRING");
	    }

)
))?	otherlv_10='index' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getIndexKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getIndexEIntParserRuleCall_8_0()); 
	    }
		lv_index_11_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"index",
        		lv_index_11_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_12='predicated' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getPredicatedKeyword_9_0());
    }
	otherlv_13=':' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getColonKeyword_9_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActivityAccess().getHasPredicateEBooleanParserRuleCall_9_2_0()); 
	    }
		lv_hasPredicate_14_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActivityRule());
	        }
       		set(
       			$current, 
       			"hasPredicate",
        		lv_hasPredicate_14_0, 
        		"EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_15='icon' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getIconKeyword_10_0());
    }
	otherlv_16=':' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getColonKeyword_10_1());
    }
(
(
		lv_imagePathOff_17_0=RULE_STRING
		{
			newLeafNode(lv_imagePathOff_17_0, grammarAccess.getActivityAccess().getImagePathOffSTRINGTerminalRuleCall_10_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActivityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePathOff",
        		lv_imagePathOff_17_0, 
        		"STRING");
	    }

)
))?	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_11());
    }
)
;





// Entry rule entryRulePageExtension
entryRulePageExtension returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageExtensionRule()); }
	 iv_rulePageExtension=rulePageExtension 
	 { $current=$iv_rulePageExtension.current; } 
	 EOF 
;

// Rule PageExtension
rulePageExtension returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPageExtensionAccess().getPageExtensionAction_0(),
            $current);
    }
)	otherlv_1='page' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPageExtensionAccess().getPageKeyword_1());
    }
	otherlv_2='extensions' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPageExtensionAccess().getExtensionsKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPageExtensionAccess().getLeftCurlyBracketKeyword_3());
    }
	otherlv_4='extended' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPageExtensionAccess().getExtendedKeyword_4());
    }
	otherlv_5='page' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPageExtensionAccess().getPageKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageExtensionAccess().getExtendedPageIDFQNParserRuleCall_6_0()); 
	    }
		lv_extendedPageID_6_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageExtensionRule());
	        }
       		set(
       			$current, 
       			"extendedPageID",
        		lv_extendedPageID_6_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPageExtensionAccess().getOwnedSectionsSectionParserRuleCall_7_0()); 
	    }
		lv_ownedSections_7_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageExtensionRule());
	        }
       		add(
       			$current, 
       			"ownedSections",
        		lv_ownedSections_7_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPageExtensionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleSectionExtension
entryRuleSectionExtension returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSectionExtensionRule()); }
	 iv_ruleSectionExtension=ruleSectionExtension 
	 { $current=$iv_ruleSectionExtension.current; } 
	 EOF 
;

// Rule SectionExtension
ruleSectionExtension returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSectionExtensionAccess().getSectionExtensionAction_0(),
            $current);
    }
)	otherlv_1='section' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSectionExtensionAccess().getSectionKeyword_1());
    }
	otherlv_2='extensions' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSectionExtensionAccess().getExtensionsKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSectionExtensionAccess().getLeftCurlyBracketKeyword_3());
    }
	otherlv_4='extended' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSectionExtensionAccess().getExtendedKeyword_4());
    }
	otherlv_5='section' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSectionExtensionAccess().getSectionKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getExtendedSectionIDFQNParserRuleCall_6_0()); 
	    }
		lv_extendedSectionID_6_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
	        }
       		set(
       			$current, 
       			"extendedSectionID",
        		lv_extendedSectionID_6_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSectionExtensionAccess().getOwnedActivitiesActivityParserRuleCall_7_0()); 
	    }
		lv_ownedActivities_7_0=ruleActivity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSectionExtensionRule());
	        }
       		add(
       			$current, 
       			"ownedActivities",
        		lv_ownedActivities_7_0, 
        		"Activity");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSectionExtensionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleOverview
entryRuleOverview returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOverviewRule()); }
	 iv_ruleOverview=ruleOverview 
	 { $current=$iv_ruleOverview.current; } 
	 EOF 
;

// Rule Overview
ruleOverview returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOverviewAccess().getOverviewAction_0(),
            $current);
    }
)	otherlv_1='Overview' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOverviewAccess().getOverviewKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOverviewAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='description' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOverviewAccess().getDescriptionKeyword_3_0());
    }
(
(
		lv_description_4_0=RULE_STRING
		{
			newLeafNode(lv_description_4_0, grammarAccess.getOverviewAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOverviewRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_4_0, 
        		"STRING");
	    }

)
))?(	otherlv_5='image' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getOverviewAccess().getImageKeyword_4_0());
    }
	otherlv_6='on' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getOverviewAccess().getOnKeyword_4_1());
    }
	otherlv_7=':' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getOverviewAccess().getColonKeyword_4_2());
    }
(
(
		lv_imagePathOn_8_0=RULE_STRING
		{
			newLeafNode(lv_imagePathOn_8_0, grammarAccess.getOverviewAccess().getImagePathOnSTRINGTerminalRuleCall_4_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOverviewRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePathOn",
        		lv_imagePathOn_8_0, 
        		"STRING");
	    }

)
))?(	otherlv_9='image' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getOverviewAccess().getImageKeyword_5_0());
    }
	otherlv_10='off' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getOverviewAccess().getOffKeyword_5_1());
    }
	otherlv_11=':' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getOverviewAccess().getColonKeyword_5_2());
    }
(
(
		lv_imagePathOff_12_0=RULE_STRING
		{
			newLeafNode(lv_imagePathOff_12_0, grammarAccess.getOverviewAccess().getImagePathOffSTRINGTerminalRuleCall_5_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOverviewRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePathOff",
        		lv_imagePathOff_12_0, 
        		"STRING");
	    }

)
))?	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getOverviewAccess().getRightCurlyBracketKeyword_6());
    }
)
;







// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
(( RULE_ID)=>    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
))*)
    ;





// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); } 
	 iv_ruleEBoolean=ruleEBoolean 
	 { $current=$iv_ruleEBoolean.current.getText(); }  
	 EOF 
;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


