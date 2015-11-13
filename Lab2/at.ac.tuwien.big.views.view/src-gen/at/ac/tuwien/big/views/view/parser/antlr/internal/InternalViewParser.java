package at.ac.tuwien.big.views.view.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.views.view.services.ViewGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalViewParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'welcome'", "'viewgroup'", "'{'", "','", "'}'", "'start'", "'index-view'", "'handles'", "'view-description'", "'create-view'", "'read-view'", "'update-view'", "'delete-view'", "'elementgroup'", "'with'", "'list'", "'table'", "'column'", "'date-time-picker'", "'long'", "'text'", "'format'", "'selection'", "'selection-item'", "'enum-literal'", "'link'", "'composite-condition'", "':'", "'('", "'||'", "')'", "'?'", "'comparison-condition'", "'.'", "'vertical'", "'horizontal'", "'Hide'", "'Show'", "'Enable'", "'Disable'", "'And'", "'Or'", "'=='", "'<'", "'>'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalViewParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalViewParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalViewParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g"; }



     	private ViewGrammarAccess grammarAccess;
     	
        public InternalViewParser(TokenStream input, ViewGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ViewModel";	
       	}
       	
       	@Override
       	protected ViewGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleViewModel"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:68:1: entryRuleViewModel returns [EObject current=null] : iv_ruleViewModel= ruleViewModel EOF ;
    public final EObject entryRuleViewModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewModel = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:69:2: (iv_ruleViewModel= ruleViewModel EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:70:2: iv_ruleViewModel= ruleViewModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleViewModel_in_entryRuleViewModel75);
            iv_ruleViewModel=ruleViewModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewModel"


    // $ANTLR start "ruleViewModel"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:77:1: ruleViewModel returns [EObject current=null] : ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )? ;
    public final EObject ruleViewModel() throws RecognitionException {
        EObject current = null;

        EObject lv_viewGroups_0_0 = null;

        EObject lv_viewGroups_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:80:28: ( ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:1: ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )?
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:1: ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:2: ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:2: ( (lv_viewGroups_0_0= ruleViewGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:82:1: (lv_viewGroups_0_0= ruleViewGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:82:1: (lv_viewGroups_0_0= ruleViewGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:83:3: lv_viewGroups_0_0= ruleViewGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewModelAccess().getViewGroupsViewGroupParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleViewGroup_in_ruleViewModel131);
                    lv_viewGroups_0_0=ruleViewGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewModelRule());
                      	        }
                             		add(
                             			current, 
                             			"viewGroups",
                              		lv_viewGroups_0_0, 
                              		"ViewGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:99:2: ( (lv_viewGroups_1_0= ruleViewGroup ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:100:1: (lv_viewGroups_1_0= ruleViewGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:100:1: (lv_viewGroups_1_0= ruleViewGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:101:3: lv_viewGroups_1_0= ruleViewGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewModelAccess().getViewGroupsViewGroupParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleViewGroup_in_ruleViewModel152);
                    	    lv_viewGroups_1_0=ruleViewGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"viewGroups",
                    	              		lv_viewGroups_1_0, 
                    	              		"ViewGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewModel"


    // $ANTLR start "entryRuleViewGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:125:1: entryRuleViewGroup returns [EObject current=null] : iv_ruleViewGroup= ruleViewGroup EOF ;
    public final EObject entryRuleViewGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewGroup = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:126:2: (iv_ruleViewGroup= ruleViewGroup EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:127:2: iv_ruleViewGroup= ruleViewGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleViewGroup_in_entryRuleViewGroup190);
            iv_ruleViewGroup=ruleViewGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewGroup200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewGroup"


    // $ANTLR start "ruleViewGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:134:1: ruleViewGroup returns [EObject current=null] : ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleViewGroup() throws RecognitionException {
        EObject current = null;

        Token lv_welcomeViewGroup_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_views_4_0 = null;

        EObject lv_views_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:137:28: ( ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:1: ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:1: ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:2: ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:2: ( (lv_welcomeViewGroup_0_0= 'welcome' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:139:1: (lv_welcomeViewGroup_0_0= 'welcome' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:139:1: (lv_welcomeViewGroup_0_0= 'welcome' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:140:3: lv_welcomeViewGroup_0_0= 'welcome'
                    {
                    lv_welcomeViewGroup_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleViewGroup243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_welcomeViewGroup_0_0, grammarAccess.getViewGroupAccess().getWelcomeViewGroupWelcomeKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewGroupRule());
                      	        }
                             		setWithLastConsumed(current, "welcomeViewGroup", true, "welcome");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleViewGroup269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewGroupAccess().getViewgroupKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:157:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:158:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:158:1: (lv_name_2_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:159:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleViewGroup286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getViewGroupAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getViewGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleViewGroup303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewGroupAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:179:1: ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=17)||(LA5_0>=45 && LA5_0<=46)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:179:2: ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:179:2: ( (lv_views_4_0= ruleView ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:180:1: (lv_views_4_0= ruleView )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:180:1: (lv_views_4_0= ruleView )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:181:3: lv_views_4_0= ruleView
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewGroupAccess().getViewsViewParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleViewGroup325);
                    lv_views_4_0=ruleView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewGroupRule());
                      	        }
                             		add(
                             			current, 
                             			"views",
                              		lv_views_4_0, 
                              		"View");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:197:2: (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:197:4: otherlv_5= ',' ( (lv_views_6_0= ruleView ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleViewGroup338); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getViewGroupAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:201:1: ( (lv_views_6_0= ruleView ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:202:1: (lv_views_6_0= ruleView )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:202:1: (lv_views_6_0= ruleView )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:203:3: lv_views_6_0= ruleView
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewGroupAccess().getViewsViewParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleViewGroup359);
                    	    lv_views_6_0=ruleView();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewGroupRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"views",
                    	              		lv_views_6_0, 
                    	              		"View");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleViewGroup375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getViewGroupAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewGroup"


    // $ANTLR start "entryRuleView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:231:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:232:2: (iv_ruleView= ruleView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:233:2: iv_ruleView= ruleView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleView_in_entryRuleView411);
            iv_ruleView=ruleView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleView421); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:240:1: ruleView returns [EObject current=null] : (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_ClassIndexView_0 = null;

        EObject this_ClassOperationView_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:243:28: ( (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:244:1: (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:244:1: (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=45 && LA6_0<=46)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:245:5: this_ClassIndexView_0= ruleClassIndexView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewAccess().getClassIndexViewParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClassIndexView_in_ruleView468);
                    this_ClassIndexView_0=ruleClassIndexView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassIndexView_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:255:5: this_ClassOperationView_1= ruleClassOperationView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewAccess().getClassOperationViewParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClassOperationView_in_ruleView495);
                    this_ClassOperationView_1=ruleClassOperationView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassOperationView_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleClassIndexView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:271:1: entryRuleClassIndexView returns [EObject current=null] : iv_ruleClassIndexView= ruleClassIndexView EOF ;
    public final EObject entryRuleClassIndexView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIndexView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:272:2: (iv_ruleClassIndexView= ruleClassIndexView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:273:2: iv_ruleClassIndexView= ruleClassIndexView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassIndexViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassIndexView_in_entryRuleClassIndexView530);
            iv_ruleClassIndexView=ruleClassIndexView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassIndexView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassIndexView540); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassIndexView"


    // $ANTLR start "ruleClassIndexView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:280:1: ruleClassIndexView returns [EObject current=null] : ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleClassIndexView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_header_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_link_9_0 = null;

        EObject lv_link_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:283:28: ( ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:1: ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:1: ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:2: ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= RULE_ID ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:2: ( (lv_startView_0_0= 'start' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:285:1: (lv_startView_0_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:285:1: (lv_startView_0_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:286:3: lv_startView_0_0= 'start'
                    {
                    lv_startView_0_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClassIndexView583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_0_0, grammarAccess.getClassIndexViewAccess().getStartViewStartKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassIndexViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClassIndexView609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassIndexViewAccess().getIndexViewKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:303:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:304:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:304:1: (lv_name_2_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:305:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleClassIndexView626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getClassIndexViewAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassIndexViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:321:2: ( (lv_header_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:322:1: (lv_header_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:322:1: (lv_header_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:323:3: lv_header_3_0= RULE_STRING
            {
            lv_header_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleClassIndexView648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_3_0, grammarAccess.getClassIndexViewAccess().getHeaderSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassIndexViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClassIndexView665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassIndexViewAccess().getHandlesKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:343:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:344:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:344:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:345:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassIndexViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getClassClassCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleClassIndexView688);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClassIndexView700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassIndexViewAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:362:1: (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:362:3: otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClassIndexView713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClassIndexViewAccess().getViewDescriptionKeyword_7_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:366:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:367:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:367:1: (lv_description_8_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:368:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleClassIndexView730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_8_0, grammarAccess.getClassIndexViewAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassIndexViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:384:4: ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:384:5: ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:384:5: ( (lv_link_9_0= ruleLink ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:385:1: (lv_link_9_0= ruleLink )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:385:1: (lv_link_9_0= ruleLink )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:386:3: lv_link_9_0= ruleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getLinkLinkParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleClassIndexView759);
                    lv_link_9_0=ruleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassIndexViewRule());
                      	        }
                             		add(
                             			current, 
                             			"link",
                              		lv_link_9_0, 
                              		"Link");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:402:2: (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:402:4: otherlv_10= ',' ( (lv_link_11_0= ruleLink ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClassIndexView772); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassIndexViewAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:406:1: ( (lv_link_11_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:407:1: (lv_link_11_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:407:1: (lv_link_11_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:408:3: lv_link_11_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getLinkLinkParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleClassIndexView793);
                    	    lv_link_11_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassIndexViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_11_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClassIndexView809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClassIndexViewAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassIndexView"


    // $ANTLR start "entryRuleClassOperationView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:436:1: entryRuleClassOperationView returns [EObject current=null] : iv_ruleClassOperationView= ruleClassOperationView EOF ;
    public final EObject entryRuleClassOperationView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOperationView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:437:2: (iv_ruleClassOperationView= ruleClassOperationView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:438:2: iv_ruleClassOperationView= ruleClassOperationView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOperationViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassOperationView_in_entryRuleClassOperationView845);
            iv_ruleClassOperationView=ruleClassOperationView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOperationView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassOperationView855); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassOperationView"


    // $ANTLR start "ruleClassOperationView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:445:1: ruleClassOperationView returns [EObject current=null] : (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView ) ;
    public final EObject ruleClassOperationView() throws RecognitionException {
        EObject current = null;

        EObject this_CreateView_0 = null;

        EObject this_ReadView_1 = null;

        EObject this_UpdateView_2 = null;

        EObject this_DeleteView_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:448:28: ( (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:449:1: (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:449:1: (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case 20:
                        {
                        alt11=1;
                        }
                        break;
                    case 23:
                        {
                        alt11=4;
                        }
                        break;
                    case 22:
                        {
                        alt11=3;
                        }
                        break;
                    case 21:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 21:
                    {
                    alt11=2;
                    }
                    break;
                case 20:
                    {
                    alt11=1;
                    }
                    break;
                case 23:
                    {
                    alt11=4;
                    }
                    break;
                case 22:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==46) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case 20:
                        {
                        alt11=1;
                        }
                        break;
                    case 23:
                        {
                        alt11=4;
                        }
                        break;
                    case 22:
                        {
                        alt11=3;
                        }
                        break;
                    case 21:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 22:
                    {
                    alt11=3;
                    }
                    break;
                case 21:
                    {
                    alt11=2;
                    }
                    break;
                case 20:
                    {
                    alt11=1;
                    }
                    break;
                case 23:
                    {
                    alt11=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:450:5: this_CreateView_0= ruleCreateView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getCreateViewParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCreateView_in_ruleClassOperationView902);
                    this_CreateView_0=ruleCreateView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateView_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:460:5: this_ReadView_1= ruleReadView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getReadViewParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReadView_in_ruleClassOperationView929);
                    this_ReadView_1=ruleReadView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReadView_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:470:5: this_UpdateView_2= ruleUpdateView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getUpdateViewParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUpdateView_in_ruleClassOperationView956);
                    this_UpdateView_2=ruleUpdateView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UpdateView_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:480:5: this_DeleteView_3= ruleDeleteView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getDeleteViewParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeleteView_in_ruleClassOperationView983);
                    this_DeleteView_3=ruleDeleteView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteView_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassOperationView"


    // $ANTLR start "entryRuleCreateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:496:1: entryRuleCreateView returns [EObject current=null] : iv_ruleCreateView= ruleCreateView EOF ;
    public final EObject entryRuleCreateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:497:2: (iv_ruleCreateView= ruleCreateView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:498:2: iv_ruleCreateView= ruleCreateView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCreateView_in_entryRuleCreateView1018);
            iv_ruleCreateView=ruleCreateView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCreateView1028); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateView"


    // $ANTLR start "ruleCreateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:505:1: ruleCreateView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleCreateView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:508:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:509:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:509:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:509:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:509:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:510:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:510:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:511:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleCreateView1074);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:527:2: ( (lv_startView_1_0= 'start' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:528:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:528:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:529:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCreateView1092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getCreateViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCreateView1118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateViewAccess().getCreateViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:546:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:547:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:547:1: (lv_name_3_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:548:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCreateView1135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateViewAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:564:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:565:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:565:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:566:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCreateView1157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getCreateViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCreateView1174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:586:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:587:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:587:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:588:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleCreateView1197);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCreateView1209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCreateViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:605:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:605:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCreateView1222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCreateViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:609:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:610:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:610:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:611:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCreateView1239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getCreateViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:627:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=45 && LA15_0<=46)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:627:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:627:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:628:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:628:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:629:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleCreateView1268);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:645:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:645:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCreateView1281); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCreateViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:649:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:650:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:650:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:651:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleCreateView1302);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCreateView1318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getCreateViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateView"


    // $ANTLR start "entryRuleReadView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:679:1: entryRuleReadView returns [EObject current=null] : iv_ruleReadView= ruleReadView EOF ;
    public final EObject entryRuleReadView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:680:2: (iv_ruleReadView= ruleReadView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:681:2: iv_ruleReadView= ruleReadView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReadView_in_entryRuleReadView1354);
            iv_ruleReadView=ruleReadView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReadView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReadView1364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadView"


    // $ANTLR start "ruleReadView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:688:1: ruleReadView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleReadView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:691:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:692:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:692:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:692:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:692:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:693:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:693:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:694:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReadViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleReadView1410);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReadViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:710:2: ( (lv_startView_1_0= 'start' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:711:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:711:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:712:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleReadView1428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getReadViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleReadView1454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReadViewAccess().getReadViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:729:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:730:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:730:1: (lv_name_3_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:731:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReadView1471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getReadViewAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReadViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:747:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:748:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:748:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:749:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReadView1493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getReadViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReadViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleReadView1510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReadViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:769:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:770:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:770:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:771:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReadViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReadViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleReadView1533);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleReadView1545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getReadViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:788:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:788:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleReadView1558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getReadViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:792:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:793:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:793:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:794:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReadView1575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getReadViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:810:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=45 && LA19_0<=46)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:810:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:810:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:811:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:811:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:812:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReadViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleReadView1604);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReadViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:828:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:828:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleReadView1617); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getReadViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:832:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:833:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:833:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:834:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReadViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleReadView1638);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReadViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleReadView1654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getReadViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadView"


    // $ANTLR start "entryRuleUpdateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:862:1: entryRuleUpdateView returns [EObject current=null] : iv_ruleUpdateView= ruleUpdateView EOF ;
    public final EObject entryRuleUpdateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:863:2: (iv_ruleUpdateView= ruleUpdateView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:864:2: iv_ruleUpdateView= ruleUpdateView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUpdateView_in_entryRuleUpdateView1690);
            iv_ruleUpdateView=ruleUpdateView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUpdateView1700); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateView"


    // $ANTLR start "ruleUpdateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:871:1: ruleUpdateView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleUpdateView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:874:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:875:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:875:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:875:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:875:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:876:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:876:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:877:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleUpdateView1746);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:893:2: ( (lv_startView_1_0= 'start' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:894:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:894:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:895:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUpdateView1764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getUpdateViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleUpdateView1790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUpdateViewAccess().getUpdateViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:912:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:913:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:913:1: (lv_name_3_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:914:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUpdateView1807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getUpdateViewAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:930:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:931:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:931:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:932:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUpdateView1829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getUpdateViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUpdateView1846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUpdateViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:952:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:953:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:953:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:954:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateView1869);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUpdateView1881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUpdateViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:971:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:971:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleUpdateView1894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:975:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:976:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:976:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:977:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUpdateView1911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getUpdateViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:993:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=45 && LA23_0<=46)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:993:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:993:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:994:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:994:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:995:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleUpdateView1940);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1011:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1011:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUpdateView1953); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getUpdateViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1015:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1016:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1016:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1017:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUpdateViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleUpdateView1974);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUpdateView1990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getUpdateViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateView"


    // $ANTLR start "entryRuleDeleteView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1045:1: entryRuleDeleteView returns [EObject current=null] : iv_ruleDeleteView= ruleDeleteView EOF ;
    public final EObject entryRuleDeleteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1046:2: (iv_ruleDeleteView= ruleDeleteView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1047:2: iv_ruleDeleteView= ruleDeleteView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeleteView_in_entryRuleDeleteView2026);
            iv_ruleDeleteView=ruleDeleteView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeleteView2036); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteView"


    // $ANTLR start "ruleDeleteView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1054:1: ruleDeleteView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleDeleteView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1057:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1058:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1058:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1058:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= RULE_ID ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1058:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1059:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1059:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1060:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleDeleteView2082);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1076:2: ( (lv_startView_1_0= 'start' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1077:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1077:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1078:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDeleteView2100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getDeleteViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeleteViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDeleteView2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeleteViewAccess().getDeleteViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1095:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1096:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1096:1: (lv_name_3_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1097:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDeleteView2143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getDeleteViewAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1113:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1114:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1114:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1115:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDeleteView2165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getDeleteViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeleteView2182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDeleteViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1135:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1136:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1136:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1137:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDeleteView2205);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDeleteView2217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDeleteViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1154:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1154:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDeleteView2230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDeleteViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1158:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1159:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1159:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1160:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDeleteView2247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getDeleteViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeleteViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1176:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=45 && LA27_0<=46)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1176:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1176:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1177:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1177:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1178:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleDeleteView2276);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1194:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1194:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeleteView2289); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getDeleteViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1198:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1199:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1199:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1200:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDeleteViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleDeleteView2310);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDeleteView2326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getDeleteViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteView"


    // $ANTLR start "entryRuleElementGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1230:1: entryRuleElementGroup returns [EObject current=null] : iv_ruleElementGroup= ruleElementGroup EOF ;
    public final EObject entryRuleElementGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementGroup = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1231:2: (iv_ruleElementGroup= ruleElementGroup EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1232:2: iv_ruleElementGroup= ruleElementGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_entryRuleElementGroup2364);
            iv_ruleElementGroup=ruleElementGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementGroup2374); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementGroup"


    // $ANTLR start "ruleElementGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1239:1: ruleElementGroup returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleElementGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_header_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_layout_0_0 = null;

        EObject lv_viewElements_4_0 = null;

        EObject lv_viewElements_6_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1242:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1243:1: ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1243:1: ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? otherlv_9= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1243:2: ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? otherlv_9= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1243:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1244:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1244:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1245:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementGroupAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleElementGroup2420);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleElementGroup2432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getElementGroupAccess().getElementgroupKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1265:1: ( (lv_header_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1266:1: (lv_header_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1266:1: (lv_header_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1267:3: lv_header_2_0= RULE_STRING
            {
            lv_header_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElementGroup2449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_2_0, grammarAccess.getElementGroupAccess().getHeaderSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getElementGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleElementGroup2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElementGroupAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1287:1: ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=26 && LA29_0<=31)||LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1287:2: ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1287:2: ( (lv_viewElements_4_0= ruleViewElement ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1288:1: (lv_viewElements_4_0= ruleViewElement )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1288:1: (lv_viewElements_4_0= ruleViewElement )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1289:3: lv_viewElements_4_0= ruleViewElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementGroupAccess().getViewElementsViewElementParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleViewElement_in_ruleElementGroup2488);
                    lv_viewElements_4_0=ruleViewElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
                      	        }
                             		add(
                             			current, 
                             			"viewElements",
                              		lv_viewElements_4_0, 
                              		"ViewElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1305:2: (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1305:4: otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElementGroup2501); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getElementGroupAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1309:1: ( (lv_viewElements_6_0= ruleViewElement ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1310:1: (lv_viewElements_6_0= ruleViewElement )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1310:1: (lv_viewElements_6_0= ruleViewElement )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1311:3: lv_viewElements_6_0= ruleViewElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementGroupAccess().getViewElementsViewElementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleViewElement_in_ruleElementGroup2522);
                    	    lv_viewElements_6_0=ruleViewElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"viewElements",
                    	              		lv_viewElements_6_0, 
                    	              		"ViewElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1327:6: (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1327:8: otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleElementGroup2539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getElementGroupAccess().getWithKeyword_5_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1331:1: ( (lv_condition_8_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1332:1: (lv_condition_8_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1332:1: (lv_condition_8_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1333:3: lv_condition_8_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementGroupAccess().getConditionConditionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleElementGroup2560);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_8_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElementGroup2574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getElementGroupAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementGroup"


    // $ANTLR start "entryRuleViewElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1361:1: entryRuleViewElement returns [EObject current=null] : iv_ruleViewElement= ruleViewElement EOF ;
    public final EObject entryRuleViewElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewElement = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1362:2: (iv_ruleViewElement= ruleViewElement EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1363:2: iv_ruleViewElement= ruleViewElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleViewElement_in_entryRuleViewElement2610);
            iv_ruleViewElement=ruleViewElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewElement2620); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewElement"


    // $ANTLR start "ruleViewElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1370:1: ruleViewElement returns [EObject current=null] : (this_AssociationElement_0= ruleAssociationElement | this_PropertyElement_1= rulePropertyElement ) ;
    public final EObject ruleViewElement() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationElement_0 = null;

        EObject this_PropertyElement_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1373:28: ( (this_AssociationElement_0= ruleAssociationElement | this_PropertyElement_1= rulePropertyElement ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1374:1: (this_AssociationElement_0= ruleAssociationElement | this_PropertyElement_1= rulePropertyElement )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1374:1: (this_AssociationElement_0= ruleAssociationElement | this_PropertyElement_1= rulePropertyElement )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=26 && LA31_0<=27)) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=28 && LA31_0<=31)||LA31_0==33) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1375:5: this_AssociationElement_0= ruleAssociationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getAssociationElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssociationElement_in_ruleViewElement2667);
                    this_AssociationElement_0=ruleAssociationElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssociationElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1385:5: this_PropertyElement_1= rulePropertyElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getPropertyElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyElement_in_ruleViewElement2694);
                    this_PropertyElement_1=rulePropertyElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyElement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewElement"


    // $ANTLR start "entryRuleAssociationElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1401:1: entryRuleAssociationElement returns [EObject current=null] : iv_ruleAssociationElement= ruleAssociationElement EOF ;
    public final EObject entryRuleAssociationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationElement = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1402:2: (iv_ruleAssociationElement= ruleAssociationElement EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1403:2: iv_ruleAssociationElement= ruleAssociationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssociationElement_in_entryRuleAssociationElement2729);
            iv_ruleAssociationElement=ruleAssociationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociationElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociationElement2739); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationElement"


    // $ANTLR start "ruleAssociationElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1410:1: ruleAssociationElement returns [EObject current=null] : (this_Table_0= ruleTable | this_List_1= ruleList ) ;
    public final EObject ruleAssociationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;

        EObject this_List_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1413:28: ( (this_Table_0= ruleTable | this_List_1= ruleList ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1414:1: (this_Table_0= ruleTable | this_List_1= ruleList )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1414:1: (this_Table_0= ruleTable | this_List_1= ruleList )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            else if ( (LA32_0==26) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1415:5: this_Table_0= ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssociationElementAccess().getTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleAssociationElement2786);
                    this_Table_0=ruleTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Table_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1425:5: this_List_1= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssociationElementAccess().getListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleAssociationElement2813);
                    this_List_1=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_List_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationElement"


    // $ANTLR start "entryRuleList"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1441:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1442:2: (iv_ruleList= ruleList EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1443:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList2848);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList2858); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1450:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_link_6_0 = null;

        EObject lv_link_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1453:28: ( (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1454:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1454:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1454:3: otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleList2895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1458:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1459:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1459:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1460:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList2912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1476:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1477:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1477:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1478:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleList2934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleList2951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getListAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1498:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1499:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1499:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1500:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getAssociationAssociationCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleList2974);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleList2986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1517:1: ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1517:2: ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1517:2: ( (lv_link_6_0= ruleLink ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1518:1: (lv_link_6_0= ruleLink )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1518:1: (lv_link_6_0= ruleLink )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1519:3: lv_link_6_0= ruleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListAccess().getLinkLinkParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleList3008);
                    lv_link_6_0=ruleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListRule());
                      	        }
                             		add(
                             			current, 
                             			"link",
                              		lv_link_6_0, 
                              		"Link");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1535:2: (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1535:4: otherlv_7= ',' ( (lv_link_8_0= ruleLink ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleList3021); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getListAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1539:1: ( (lv_link_8_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1540:1: (lv_link_8_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1540:1: (lv_link_8_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1541:3: lv_link_8_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListAccess().getLinkLinkParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleList3042);
                    	    lv_link_8_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_8_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleList3058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getListAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleTable"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1569:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1570:2: (iv_ruleTable= ruleTable EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1571:2: iv_ruleTable= ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable3094);
            iv_ruleTable=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable3104); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1578:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? ) otherlv_17= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_link_6_0 = null;

        EObject lv_link_8_0 = null;

        EObject lv_link_9_0 = null;

        EObject lv_columns_11_0 = null;

        EObject lv_columns_13_0 = null;

        EObject lv_columns_14_0 = null;

        EObject lv_columns_16_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1581:28: ( (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? ) otherlv_17= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1582:1: (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? ) otherlv_17= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1582:1: (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? ) otherlv_17= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1582:3: otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTable3141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1586:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1587:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1587:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1588:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTable3158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1604:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1605:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1605:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1606:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable3180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable3197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1626:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1627:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1627:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1628:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getAssociationAssociationCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable3220);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable3232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1645:1: ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1645:2: ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1645:2: ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1645:3: ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1645:3: ( (lv_link_6_0= ruleLink ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1646:1: (lv_link_6_0= ruleLink )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1646:1: (lv_link_6_0= ruleLink )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1647:3: lv_link_6_0= ruleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTableAccess().getLinkLinkParserRuleCall_6_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleTable3255);
                    lv_link_6_0=ruleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTableRule());
                      	        }
                             		add(
                             			current, 
                             			"link",
                              		lv_link_6_0, 
                              		"Link");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1663:2: (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1663:4: otherlv_7= ',' ( (lv_link_8_0= ruleLink ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable3268); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getCommaKeyword_6_0_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1667:1: ( (lv_link_8_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1668:1: (lv_link_8_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1668:1: (lv_link_8_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1669:3: lv_link_8_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTableAccess().getLinkLinkParserRuleCall_6_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleTable3289);
                    	    lv_link_8_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_8_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1686:6: ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1686:6: ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1686:7: ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1686:7: ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==36) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1686:8: ( (lv_link_9_0= ruleLink ) ) otherlv_10= ','
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1686:8: ( (lv_link_9_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1687:1: (lv_link_9_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1687:1: (lv_link_9_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1688:3: lv_link_9_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTableAccess().getLinkLinkParserRuleCall_6_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleTable3321);
                    	    lv_link_9_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_9_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable3333); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getCommaKeyword_6_1_0_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1708:3: ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1708:4: ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1708:4: ( (lv_columns_11_0= ruleColumn ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1709:1: (lv_columns_11_0= ruleColumn )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1709:1: (lv_columns_11_0= ruleColumn )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1710:3: lv_columns_11_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable3357);
                    lv_columns_11_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTableRule());
                      	        }
                             		add(
                             			current, 
                             			"columns",
                              		lv_columns_11_0, 
                              		"Column");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1726:2: (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1726:4: otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable3370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getTableAccess().getCommaKeyword_6_1_1_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1730:1: ( (lv_columns_13_0= ruleColumn ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1731:1: (lv_columns_13_0= ruleColumn )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1731:1: (lv_columns_13_0= ruleColumn )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1732:3: lv_columns_13_0= ruleColumn
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_1_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable3391);
                    	    lv_columns_13_0=ruleColumn();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"columns",
                    	              		lv_columns_13_0, 
                    	              		"Column");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1749:6: ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )?
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1749:6: ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==28) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1749:7: ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )*
                            {
                            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1749:7: ( (lv_columns_14_0= ruleColumn ) )
                            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1750:1: (lv_columns_14_0= ruleColumn )
                            {
                            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1750:1: (lv_columns_14_0= ruleColumn )
                            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1751:3: lv_columns_14_0= ruleColumn
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable3423);
                            lv_columns_14_0=ruleColumn();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTableRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"columns",
                                      		lv_columns_14_0, 
                                      		"Column");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1767:2: (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==14) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1767:4: otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) )
                            	    {
                            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable3436); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_15, grammarAccess.getTableAccess().getCommaKeyword_6_2_1_0());
                            	          
                            	    }
                            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1771:1: ( (lv_columns_16_0= ruleColumn ) )
                            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1772:1: (lv_columns_16_0= ruleColumn )
                            	    {
                            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1772:1: (lv_columns_16_0= ruleColumn )
                            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1773:3: lv_columns_16_0= ruleColumn
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable3457);
                            	    lv_columns_16_0=ruleColumn();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTableRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"columns",
                            	              		lv_columns_16_0, 
                            	              		"Column");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable3474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRulePropertyElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1801:1: entryRulePropertyElement returns [EObject current=null] : iv_rulePropertyElement= rulePropertyElement EOF ;
    public final EObject entryRulePropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyElement = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1802:2: (iv_rulePropertyElement= rulePropertyElement EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1803:2: iv_rulePropertyElement= rulePropertyElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyElement_in_entryRulePropertyElement3510);
            iv_rulePropertyElement=rulePropertyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyElement3520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyElement"


    // $ANTLR start "rulePropertyElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1810:1: rulePropertyElement returns [EObject current=null] : (this_Column_0= ruleColumn | this_Text_1= ruleText | this_Selection_2= ruleSelection | this_DateTimePicker_3= ruleDateTimePicker ) ;
    public final EObject rulePropertyElement() throws RecognitionException {
        EObject current = null;

        EObject this_Column_0 = null;

        EObject this_Text_1 = null;

        EObject this_Selection_2 = null;

        EObject this_DateTimePicker_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1813:28: ( (this_Column_0= ruleColumn | this_Text_1= ruleText | this_Selection_2= ruleSelection | this_DateTimePicker_3= ruleDateTimePicker ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1814:1: (this_Column_0= ruleColumn | this_Text_1= ruleText | this_Selection_2= ruleSelection | this_DateTimePicker_3= ruleDateTimePicker )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1814:1: (this_Column_0= ruleColumn | this_Text_1= ruleText | this_Selection_2= ruleSelection | this_DateTimePicker_3= ruleDateTimePicker )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt41=1;
                }
                break;
            case 30:
            case 31:
                {
                alt41=2;
                }
                break;
            case 33:
                {
                alt41=3;
                }
                break;
            case 29:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1815:5: this_Column_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyElementAccess().getColumnParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rulePropertyElement3567);
                    this_Column_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Column_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1825:5: this_Text_1= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyElementAccess().getTextParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_rulePropertyElement3594);
                    this_Text_1=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Text_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1835:5: this_Selection_2= ruleSelection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyElementAccess().getSelectionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelection_in_rulePropertyElement3621);
                    this_Selection_2=ruleSelection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Selection_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1845:5: this_DateTimePicker_3= ruleDateTimePicker
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyElementAccess().getDateTimePickerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateTimePicker_in_rulePropertyElement3648);
                    this_DateTimePicker_3=ruleDateTimePicker();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateTimePicker_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyElement"


    // $ANTLR start "entryRuleColumn"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1861:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1862:2: (iv_ruleColumn= ruleColumn EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1863:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn3683);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn3693); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1870:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1873:28: ( (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1874:1: (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1874:1: (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1874:3: otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleColumn3730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1878:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1879:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1879:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1880:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleColumn3747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1896:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1897:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1897:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1898:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleColumn3769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleColumn3786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1918:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1919:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1919:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1920:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getPropertyPropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleColumn3809);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleDateTimePicker"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1941:1: entryRuleDateTimePicker returns [EObject current=null] : iv_ruleDateTimePicker= ruleDateTimePicker EOF ;
    public final EObject entryRuleDateTimePicker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimePicker = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1942:2: (iv_ruleDateTimePicker= ruleDateTimePicker EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1943:2: iv_ruleDateTimePicker= ruleDateTimePicker EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTimePickerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDateTimePicker_in_entryRuleDateTimePicker3845);
            iv_ruleDateTimePicker=ruleDateTimePicker();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTimePicker; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateTimePicker3855); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTimePicker"


    // $ANTLR start "ruleDateTimePicker"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1950:1: ruleDateTimePicker returns [EObject current=null] : (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDateTimePicker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token lv_format_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1953:28: ( (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1954:1: (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1954:1: (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1954:3: otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDateTimePicker3892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDateTimePickerAccess().getDateTimePickerKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1958:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1959:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1959:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1960:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDateTimePicker3909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getDateTimePickerAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimePickerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1976:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1977:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1977:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1978:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDateTimePicker3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getDateTimePickerAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimePickerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1994:2: ( (lv_format_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1995:1: (lv_format_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1995:1: (lv_format_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1996:3: lv_format_3_0= RULE_STRING
            {
            lv_format_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDateTimePicker3953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_format_3_0, grammarAccess.getDateTimePickerAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimePickerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"format",
                      		lv_format_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDateTimePicker3970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDateTimePickerAccess().getHandlesKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2016:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2017:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2017:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2018:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimePickerRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateTimePickerAccess().getPropertyPropertyCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDateTimePicker3993);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTimePicker"


    // $ANTLR start "entryRuleText"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2039:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2040:2: (iv_ruleText= ruleText EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2041:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText4029);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText4039); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2048:1: ruleText returns [EObject current=null] : ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_long_0_0=null;
        Token otherlv_1=null;
        Token lv_elementID_2_0=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_format_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2051:28: ( ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2052:1: ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2052:1: ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2052:2: ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2052:2: ( (lv_long_0_0= 'long' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2053:1: (lv_long_0_0= 'long' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2053:1: (lv_long_0_0= 'long' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2054:3: lv_long_0_0= 'long'
                    {
                    lv_long_0_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText4082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_long_0_0, grammarAccess.getTextAccess().getLongLongKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "long", true, "long");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText4108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2071:1: ( (lv_elementID_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2072:1: (lv_elementID_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2072:1: (lv_elementID_2_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2073:3: lv_elementID_2_0= RULE_ID
            {
            lv_elementID_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleText4125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_2_0, grammarAccess.getTextAccess().getElementIDIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2089:2: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2090:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2090:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2091:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText4147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getTextAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2107:2: (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2107:4: otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText4165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getFormatKeyword_4_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2111:1: ( (lv_format_5_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2112:1: (lv_format_5_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2112:1: (lv_format_5_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2113:3: lv_format_5_0= RULE_STRING
                    {
                    lv_format_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText4182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_format_5_0, grammarAccess.getTextAccess().getFormatSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"format",
                              		lv_format_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleText4201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2133:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2134:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2134:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2135:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAccess().getPropertyPropertyCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleText4224);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSelection"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2156:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2157:2: (iv_ruleSelection= ruleSelection EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2158:2: iv_ruleSelection= ruleSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection4260);
            iv_ruleSelection=ruleSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelection; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection4270); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2165:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'selection' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_selectionItems_6_0 = null;

        EObject lv_selectionItems_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2168:28: ( (otherlv_0= 'selection' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2169:1: (otherlv_0= 'selection' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2169:1: (otherlv_0= 'selection' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2169:3: otherlv_0= 'selection' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSelection4307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2173:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2174:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2174:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2175:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSelection4324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getSelectionAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2191:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2192:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2192:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2193:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSelection4346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getSelectionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSelection4363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2213:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2214:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2214:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2215:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionAccess().getPropertyPropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSelection4386);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSelection4398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2232:1: ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=34 && LA45_0<=35)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2232:2: ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2232:2: ( (lv_selectionItems_6_0= ruleSelectionItem ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2233:1: (lv_selectionItems_6_0= ruleSelectionItem )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2233:1: (lv_selectionItems_6_0= ruleSelectionItem )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2234:3: lv_selectionItems_6_0= ruleSelectionItem
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectionAccess().getSelectionItemsSelectionItemParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_in_ruleSelection4420);
                    lv_selectionItems_6_0=ruleSelectionItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                      	        }
                             		add(
                             			current, 
                             			"selectionItems",
                              		lv_selectionItems_6_0, 
                              		"SelectionItem");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2250:2: (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2250:4: otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSelection4433); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getSelectionAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2254:1: ( (lv_selectionItems_8_0= ruleSelectionItem ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2255:1: (lv_selectionItems_8_0= ruleSelectionItem )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2255:1: (lv_selectionItems_8_0= ruleSelectionItem )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2256:3: lv_selectionItems_8_0= ruleSelectionItem
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSelectionAccess().getSelectionItemsSelectionItemParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_in_ruleSelection4454);
                    	    lv_selectionItems_8_0=ruleSelectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"selectionItems",
                    	              		lv_selectionItems_8_0, 
                    	              		"SelectionItem");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelection4470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleSelectionItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2284:1: entryRuleSelectionItem returns [EObject current=null] : iv_ruleSelectionItem= ruleSelectionItem EOF ;
    public final EObject entryRuleSelectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionItem = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2285:2: (iv_ruleSelectionItem= ruleSelectionItem EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2286:2: iv_ruleSelectionItem= ruleSelectionItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_in_entryRuleSelectionItem4506);
            iv_ruleSelectionItem=ruleSelectionItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionItem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionItem4516); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionItem"


    // $ANTLR start "ruleSelectionItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2293:1: ruleSelectionItem returns [EObject current=null] : (this_EnumerationLiteralItem_0= ruleEnumerationLiteralItem | (otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSelectionItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        EObject this_EnumerationLiteralItem_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2296:28: ( (this_EnumerationLiteralItem_0= ruleEnumerationLiteralItem | (otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2297:1: (this_EnumerationLiteralItem_0= ruleEnumerationLiteralItem | (otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2297:1: (this_EnumerationLiteralItem_0= ruleEnumerationLiteralItem | (otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            else if ( (LA46_0==34) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2298:5: this_EnumerationLiteralItem_0= ruleEnumerationLiteralItem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionItemAccess().getEnumerationLiteralItemParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralItem_in_ruleSelectionItem4563);
                    this_EnumerationLiteralItem_0=ruleEnumerationLiteralItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumerationLiteralItem_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2307:6: (otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2307:6: (otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2307:8: otherlv_1= 'selection-item' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSelectionItem4581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectionItemAccess().getSelectionItemKeyword_1_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2311:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2312:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2312:1: (lv_value_2_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2313:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSelectionItem4598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getSelectionItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectionItemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionItem"


    // $ANTLR start "entryRuleEnumerationLiteralItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2337:1: entryRuleEnumerationLiteralItem returns [EObject current=null] : iv_ruleEnumerationLiteralItem= ruleEnumerationLiteralItem EOF ;
    public final EObject entryRuleEnumerationLiteralItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralItem = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2338:2: (iv_ruleEnumerationLiteralItem= ruleEnumerationLiteralItem EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2339:2: iv_ruleEnumerationLiteralItem= ruleEnumerationLiteralItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralItem_in_entryRuleEnumerationLiteralItem4640);
            iv_ruleEnumerationLiteralItem=ruleEnumerationLiteralItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralItem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteralItem4650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteralItem"


    // $ANTLR start "ruleEnumerationLiteralItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2346:1: ruleEnumerationLiteralItem returns [EObject current=null] : (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEnumerationLiteralItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2349:28: ( (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2350:1: (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2350:1: (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2350:3: otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEnumerationLiteralItem4687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationLiteralItemAccess().getEnumLiteralKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2354:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2355:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2355:1: (lv_value_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2356:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEnumerationLiteralItem4704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getEnumerationLiteralItemAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerationLiteralItem4721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationLiteralItemAccess().getHandlesKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2376:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2377:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2377:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2378:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationLiteralItemAccess().getEnumerationLiteralEnumerationLiteralCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEnumerationLiteralItem4744);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteralItem"


    // $ANTLR start "entryRuleLink"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2401:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2402:2: (iv_ruleLink= ruleLink EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2403:2: iv_ruleLink= ruleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink4782);
            iv_ruleLink=ruleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLink; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink4792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2410:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2413:28: ( (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2414:1: (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2414:1: (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2414:3: otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleLink4829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2418:1: ( (lv_label_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2419:1: (lv_label_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2419:1: (lv_label_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2420:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLink4846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_1_0, grammarAccess.getLinkAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLink4863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getHandlesKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2440:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2441:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2441:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2442:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLinkAccess().getTargetViewClassOperationViewCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleLink4886);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleLayout"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2465:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2466:2: (iv_ruleLayout= ruleLayout EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2467:2: iv_ruleLayout= ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout4924);
            iv_ruleLayout=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayout; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout4934); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2474:1: ruleLayout returns [EObject current=null] : ( (lv_alignment_0_0= ruleLayoutStyle ) ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Enumerator lv_alignment_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2477:28: ( ( (lv_alignment_0_0= ruleLayoutStyle ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2478:1: ( (lv_alignment_0_0= ruleLayoutStyle ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2478:1: ( (lv_alignment_0_0= ruleLayoutStyle ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2479:1: (lv_alignment_0_0= ruleLayoutStyle )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2479:1: (lv_alignment_0_0= ruleLayoutStyle )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2480:3: lv_alignment_0_0= ruleLayoutStyle
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLayoutAccess().getAlignmentLayoutStyleEnumRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayoutStyle_in_ruleLayout4979);
            lv_alignment_0_0=ruleLayoutStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLayoutRule());
              	        }
                     		set(
                     			current, 
                     			"alignment",
                      		lv_alignment_0_0, 
                      		"LayoutStyle");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2504:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2505:2: (iv_ruleCondition= ruleCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2506:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition5014);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition5024); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2513:1: ruleCondition returns [EObject current=null] : this_VisibilityCondition_0= ruleVisibilityCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_VisibilityCondition_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2516:28: (this_VisibilityCondition_0= ruleVisibilityCondition )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2518:5: this_VisibilityCondition_0= ruleVisibilityCondition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionAccess().getVisibilityConditionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_ruleCondition5070);
            this_VisibilityCondition_0=ruleVisibilityCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VisibilityCondition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleVisibilityCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2534:1: entryRuleVisibilityCondition returns [EObject current=null] : iv_ruleVisibilityCondition= ruleVisibilityCondition EOF ;
    public final EObject entryRuleVisibilityCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2535:2: (iv_ruleVisibilityCondition= ruleVisibilityCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2536:2: iv_ruleVisibilityCondition= ruleVisibilityCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisibilityConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_entryRuleVisibilityCondition5104);
            iv_ruleVisibilityCondition=ruleVisibilityCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisibilityCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVisibilityCondition5114); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilityCondition"


    // $ANTLR start "ruleVisibilityCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2543:1: ruleVisibilityCondition returns [EObject current=null] : (this_CompositeCondition_0= ruleCompositeCondition | this_ComparisonCondition_1= ruleComparisonCondition ) ;
    public final EObject ruleVisibilityCondition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeCondition_0 = null;

        EObject this_ComparisonCondition_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2546:28: ( (this_CompositeCondition_0= ruleCompositeCondition | this_ComparisonCondition_1= ruleComparisonCondition ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2547:1: (this_CompositeCondition_0= ruleCompositeCondition | this_ComparisonCondition_1= ruleComparisonCondition )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2547:1: (this_CompositeCondition_0= ruleCompositeCondition | this_ComparisonCondition_1= ruleComparisonCondition )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            else if ( (LA47_0==43) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2548:5: this_CompositeCondition_0= ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVisibilityConditionAccess().getCompositeConditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_ruleVisibilityCondition5161);
                    this_CompositeCondition_0=ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeCondition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2558:5: this_ComparisonCondition_1= ruleComparisonCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVisibilityConditionAccess().getComparisonConditionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonCondition_in_ruleVisibilityCondition5188);
                    this_ComparisonCondition_1=ruleComparisonCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComparisonCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2574:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2575:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2576:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition5223);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition5233); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2583:1: ruleCompositeCondition returns [EObject current=null] : (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )* )? otherlv_9= ')' otherlv_10= '?' ( (lv_type_11_0= ruleVisibilityConditionType ) ) ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_composedConditions_4_0 = null;

        Enumerator lv_compositionType_5_0 = null;

        Enumerator lv_compositionType_7_0 = null;

        EObject lv_composedConditions_8_0 = null;

        Enumerator lv_type_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2586:28: ( (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )* )? otherlv_9= ')' otherlv_10= '?' ( (lv_type_11_0= ruleVisibilityConditionType ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2587:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )* )? otherlv_9= ')' otherlv_10= '?' ( (lv_type_11_0= ruleVisibilityConditionType ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2587:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )* )? otherlv_9= ')' otherlv_10= '?' ( (lv_type_11_0= ruleVisibilityConditionType ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2587:3: otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )* )? otherlv_9= ')' otherlv_10= '?' ( (lv_type_11_0= ruleVisibilityConditionType ) )
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCompositeCondition5270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2591:1: ( (lv_conditionID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2592:1: (lv_conditionID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2592:1: (lv_conditionID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2593:3: lv_conditionID_1_0= RULE_ID
            {
            lv_conditionID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompositeCondition5287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_conditionID_1_0, grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCompositeCondition5304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeConditionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCompositeCondition5316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2617:1: ( ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37||LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2617:2: ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2617:2: ( (lv_composedConditions_4_0= ruleVisibilityCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2618:1: (lv_composedConditions_4_0= ruleVisibilityCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2618:1: (lv_composedConditions_4_0= ruleVisibilityCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2619:3: lv_composedConditions_4_0= ruleVisibilityCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsVisibilityConditionParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition5338);
                    lv_composedConditions_4_0=ruleVisibilityCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
                      	        }
                             		add(
                             			current, 
                             			"composedConditions",
                              		lv_composedConditions_4_0, 
                              		"VisibilityCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2635:2: ( (lv_compositionType_5_0= ruleCompositeConditionType ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2636:1: (lv_compositionType_5_0= ruleCompositeConditionType )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2636:1: (lv_compositionType_5_0= ruleCompositeConditionType )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2637:3: lv_compositionType_5_0= ruleCompositeConditionType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition5359);
                    lv_compositionType_5_0=ruleCompositeConditionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositionType",
                              		lv_compositionType_5_0, 
                              		"CompositeConditionType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2653:2: (otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==40) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2653:4: otherlv_6= '||' ( (lv_compositionType_7_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_8_0= ruleVisibilityCondition ) )
                    	    {
                    	    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCompositeCondition5372); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getCompositeConditionAccess().getVerticalLineVerticalLineKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2657:1: ( (lv_compositionType_7_0= ruleCompositeConditionType ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2658:1: (lv_compositionType_7_0= ruleCompositeConditionType )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2658:1: (lv_compositionType_7_0= ruleCompositeConditionType )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2659:3: lv_compositionType_7_0= ruleCompositeConditionType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition5393);
                    	    lv_compositionType_7_0=ruleCompositeConditionType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"compositionType",
                    	              		lv_compositionType_7_0, 
                    	              		"CompositeConditionType");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2675:2: ( (lv_composedConditions_8_0= ruleVisibilityCondition ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2676:1: (lv_composedConditions_8_0= ruleVisibilityCondition )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2676:1: (lv_composedConditions_8_0= ruleVisibilityCondition )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2677:3: lv_composedConditions_8_0= ruleVisibilityCondition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsVisibilityConditionParserRuleCall_4_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition5414);
                    	    lv_composedConditions_8_0=ruleVisibilityCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"composedConditions",
                    	              		lv_composedConditions_8_0, 
                    	              		"VisibilityCondition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCompositeCondition5430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_10=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCompositeCondition5442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2701:1: ( (lv_type_11_0= ruleVisibilityConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2702:1: (lv_type_11_0= ruleVisibilityConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2702:1: (lv_type_11_0= ruleVisibilityConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2703:3: lv_type_11_0= ruleVisibilityConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getTypeVisibilityConditionTypeEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityConditionType_in_ruleCompositeCondition5463);
            lv_type_11_0=ruleVisibilityConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_11_0, 
                      		"VisibilityConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleComparisonCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2727:1: entryRuleComparisonCondition returns [EObject current=null] : iv_ruleComparisonCondition= ruleComparisonCondition EOF ;
    public final EObject entryRuleComparisonCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2728:2: (iv_ruleComparisonCondition= ruleComparisonCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2729:2: iv_ruleComparisonCondition= ruleComparisonCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisonCondition_in_entryRuleComparisonCondition5499);
            iv_ruleComparisonCondition=ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonCondition5509); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonCondition"


    // $ANTLR start "ruleComparisonCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2736:1: ruleComparisonCondition returns [EObject current=null] : (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) ) ;
    public final EObject ruleComparisonCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_comparisonValue_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_comparisonType_4_0 = null;

        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2739:28: ( (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2740:1: (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2740:1: (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2740:3: otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) )
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleComparisonCondition5546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComparisonConditionAccess().getComparisonConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2744:1: ( (lv_conditionID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2745:1: (lv_conditionID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2745:1: (lv_conditionID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2746:3: lv_conditionID_1_0= RULE_ID
            {
            lv_conditionID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComparisonCondition5563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_conditionID_1_0, grammarAccess.getComparisonConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComparisonConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleComparisonCondition5580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComparisonConditionAccess().getColonKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2766:1: ( (otherlv_3= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2767:1: (otherlv_3= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2767:1: (otherlv_3= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2768:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComparisonConditionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComparisonCondition5600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getComparisonConditionAccess().getPropertyPropertyElementCrossReference_3_0()); 
              	
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2779:2: ( (lv_comparisonType_4_0= ruleComparisonConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2780:1: (lv_comparisonType_4_0= ruleComparisonConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2780:1: (lv_comparisonType_4_0= ruleComparisonConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2781:3: lv_comparisonType_4_0= ruleComparisonConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonConditionAccess().getComparisonTypeComparisonConditionTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisonConditionType_in_ruleComparisonCondition5621);
            lv_comparisonType_4_0=ruleComparisonConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonConditionRule());
              	        }
                     		set(
                     			current, 
                     			"comparisonType",
                      		lv_comparisonType_4_0, 
                      		"ComparisonConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2797:2: ( (lv_comparisonValue_5_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2798:1: (lv_comparisonValue_5_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2798:1: (lv_comparisonValue_5_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2799:3: lv_comparisonValue_5_0= RULE_STRING
            {
            lv_comparisonValue_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleComparisonCondition5638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_comparisonValue_5_0, grammarAccess.getComparisonConditionAccess().getComparisonValueSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComparisonConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"comparisonValue",
                      		lv_comparisonValue_5_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleComparisonCondition5655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getComparisonConditionAccess().getQuestionMarkKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2819:1: ( (lv_type_7_0= ruleVisibilityConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2820:1: (lv_type_7_0= ruleVisibilityConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2820:1: (lv_type_7_0= ruleVisibilityConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2821:3: lv_type_7_0= ruleVisibilityConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonConditionAccess().getTypeVisibilityConditionTypeEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityConditionType_in_ruleComparisonCondition5676);
            lv_type_7_0=ruleVisibilityConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonConditionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_7_0, 
                      		"VisibilityConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonCondition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2847:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2848:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2849:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5715);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName5726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2856:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2859:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2860:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2860:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2860:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName5766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2867:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==44) && (synpred1_InternalView())) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2867:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2867:2: ( ( '.' )=>kw= '.' )
            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2867:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleQualifiedName5794); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName5810); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLayoutStyle"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2890:1: ruleLayoutStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) ) ;
    public final Enumerator ruleLayoutStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2892:28: ( ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2893:1: ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2893:1: ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            else if ( (LA51_0==46) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2893:2: (enumLiteral_0= 'vertical' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2893:2: (enumLiteral_0= 'vertical' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2893:4: enumLiteral_0= 'vertical'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLayoutStyle5871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLayoutStyleAccess().getVerticalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLayoutStyleAccess().getVerticalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2899:6: (enumLiteral_1= 'horizontal' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2899:6: (enumLiteral_1= 'horizontal' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2899:8: enumLiteral_1= 'horizontal'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleLayoutStyle5888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLayoutStyleAccess().getHorizontalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLayoutStyleAccess().getHorizontalEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutStyle"


    // $ANTLR start "ruleVisibilityConditionType"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2909:1: ruleVisibilityConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) ) ;
    public final Enumerator ruleVisibilityConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2911:28: ( ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2912:1: ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2912:1: ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt52=1;
                }
                break;
            case 48:
                {
                alt52=2;
                }
                break;
            case 49:
                {
                alt52=3;
                }
                break;
            case 50:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2912:2: (enumLiteral_0= 'Hide' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2912:2: (enumLiteral_0= 'Hide' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2912:4: enumLiteral_0= 'Hide'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleVisibilityConditionType5933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getHideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityConditionTypeAccess().getHideEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2918:6: (enumLiteral_1= 'Show' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2918:6: (enumLiteral_1= 'Show' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2918:8: enumLiteral_1= 'Show'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleVisibilityConditionType5950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getShowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityConditionTypeAccess().getShowEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2924:6: (enumLiteral_2= 'Enable' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2924:6: (enumLiteral_2= 'Enable' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2924:8: enumLiteral_2= 'Enable'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleVisibilityConditionType5967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getEnableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityConditionTypeAccess().getEnableEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2930:6: (enumLiteral_3= 'Disable' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2930:6: (enumLiteral_3= 'Disable' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2930:8: enumLiteral_3= 'Disable'
                    {
                    enumLiteral_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleVisibilityConditionType5984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getDisableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getVisibilityConditionTypeAccess().getDisableEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityConditionType"


    // $ANTLR start "ruleCompositeConditionType"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2940:1: ruleCompositeConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) ;
    public final Enumerator ruleCompositeConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2942:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2943:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2943:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            else if ( (LA53_0==52) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2943:2: (enumLiteral_0= 'And' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2943:2: (enumLiteral_0= 'And' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2943:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCompositeConditionType6029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2949:6: (enumLiteral_1= 'Or' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2949:6: (enumLiteral_1= 'Or' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2949:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCompositeConditionType6046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeConditionType"


    // $ANTLR start "ruleComparisonConditionType"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2959:1: ruleComparisonConditionType returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleComparisonConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2961:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2962:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2962:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt54=1;
                }
                break;
            case 54:
                {
                alt54=2;
                }
                break;
            case 55:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2962:2: (enumLiteral_0= '==' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2962:2: (enumLiteral_0= '==' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2962:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleComparisonConditionType6091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonConditionTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonConditionTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2968:6: (enumLiteral_1= '<' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2968:6: (enumLiteral_1= '<' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2968:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleComparisonConditionType6108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonConditionTypeAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonConditionTypeAccess().getLessEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2974:6: (enumLiteral_2= '>' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2974:6: (enumLiteral_2= '>' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2974:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleComparisonConditionType6125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonConditionTypeAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonConditionTypeAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonConditionType"

    // $ANTLR start synpred1_InternalView
    public final void synpred1_InternalView_fragment() throws RecognitionException {   
        // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2867:3: ( '.' )
        // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2868:2: '.'
        {
        match(input,44,FollowSets000.FOLLOW_44_in_synpred1_InternalView5785); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalView

    // Delegated rules

    public final boolean synpred1_InternalView() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalView_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA40_eotS =
        "\21\uffff";
    static final String DFA40_eofS =
        "\21\uffff";
    static final String DFA40_minS =
        "\1\17\1\5\1\uffff\1\22\1\4\1\16\1\4\1\34\1\uffff\1\16\1\uffff\1"+
        "\5\1\22\1\4\1\16\1\4\1\16";
    static final String DFA40_maxS =
        "\1\44\1\5\1\uffff\1\22\1\4\1\54\1\4\1\44\1\uffff\1\54\1\uffff\1"+
        "\5\1\22\1\4\1\54\1\4\1\54";
    static final String DFA40_acceptS =
        "\2\uffff\1\3\5\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA40_specialS =
        "\21\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\2\14\uffff\1\2\7\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\7\1\10\34\uffff\1\6",
            "\1\11",
            "\1\12\7\uffff\1\13",
            "",
            "\1\7\1\10\34\uffff\1\6",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\7\1\10\34\uffff\1\17",
            "\1\20",
            "\1\7\1\10\34\uffff\1\17"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1645:1: ( ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* ) | ( ( ( (lv_link_9_0= ruleLink ) ) otherlv_10= ',' )+ ( ( (lv_columns_11_0= ruleColumn ) ) (otherlv_12= ',' ( (lv_columns_13_0= ruleColumn ) ) )* ) ) | ( ( (lv_columns_14_0= ruleColumn ) ) (otherlv_15= ',' ( (lv_columns_16_0= ruleColumn ) ) )* )? )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleViewModel_in_entryRuleViewModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewGroup_in_ruleViewModel131 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleViewGroup_in_ruleViewModel152 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleViewGroup_in_entryRuleViewGroup190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewGroup200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleViewGroup243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleViewGroup269 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleViewGroup286 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleViewGroup303 = new BitSet(new long[]{0x0000600000038000L});
        public static final BitSet FOLLOW_ruleView_in_ruleViewGroup325 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleViewGroup338 = new BitSet(new long[]{0x0000600000030000L});
        public static final BitSet FOLLOW_ruleView_in_ruleViewGroup359 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleViewGroup375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_entryRuleView411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleView421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassIndexView_in_ruleView468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassOperationView_in_ruleView495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassIndexView_in_entryRuleClassIndexView530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassIndexView540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleClassIndexView583 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleClassIndexView609 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleClassIndexView626 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIndexView648 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClassIndexView665 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassIndexView688 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClassIndexView700 = new BitSet(new long[]{0x0000001000088000L});
        public static final BitSet FOLLOW_19_in_ruleClassIndexView713 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIndexView730 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleClassIndexView759 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleClassIndexView772 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleClassIndexView793 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleClassIndexView809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassOperationView_in_entryRuleClassOperationView845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassOperationView855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreateView_in_ruleClassOperationView902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadView_in_ruleClassOperationView929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateView_in_ruleClassOperationView956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeleteView_in_ruleClassOperationView983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreateView_in_entryRuleCreateView1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCreateView1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleCreateView1074 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleCreateView1092 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCreateView1118 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCreateView1135 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCreateView1157 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCreateView1174 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCreateView1197 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCreateView1209 = new BitSet(new long[]{0x0000600000088000L});
        public static final BitSet FOLLOW_19_in_ruleCreateView1222 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCreateView1239 = new BitSet(new long[]{0x0000600000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleCreateView1268 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCreateView1281 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleCreateView1302 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCreateView1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadView_in_entryRuleReadView1354 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReadView1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleReadView1410 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleReadView1428 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleReadView1454 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReadView1471 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReadView1493 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleReadView1510 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReadView1533 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleReadView1545 = new BitSet(new long[]{0x0000600000088000L});
        public static final BitSet FOLLOW_19_in_ruleReadView1558 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReadView1575 = new BitSet(new long[]{0x0000600000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleReadView1604 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleReadView1617 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleReadView1638 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleReadView1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateView_in_entryRuleUpdateView1690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUpdateView1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleUpdateView1746 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_16_in_ruleUpdateView1764 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleUpdateView1790 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateView1807 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUpdateView1829 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUpdateView1846 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateView1869 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleUpdateView1881 = new BitSet(new long[]{0x0000600000088000L});
        public static final BitSet FOLLOW_19_in_ruleUpdateView1894 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUpdateView1911 = new BitSet(new long[]{0x0000600000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleUpdateView1940 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleUpdateView1953 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleUpdateView1974 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleUpdateView1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeleteView_in_entryRuleDeleteView2026 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeleteView2036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleDeleteView2082 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleDeleteView2100 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleDeleteView2126 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteView2143 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDeleteView2165 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDeleteView2182 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDeleteView2205 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDeleteView2217 = new BitSet(new long[]{0x0000600000088000L});
        public static final BitSet FOLLOW_19_in_ruleDeleteView2230 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDeleteView2247 = new BitSet(new long[]{0x0000600000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleDeleteView2276 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleDeleteView2289 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleDeleteView2310 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleDeleteView2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementGroup_in_entryRuleElementGroup2364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementGroup2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleElementGroup2420 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleElementGroup2432 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElementGroup2449 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleElementGroup2466 = new BitSet(new long[]{0x00000002FE008000L});
        public static final BitSet FOLLOW_ruleViewElement_in_ruleElementGroup2488 = new BitSet(new long[]{0x000000000200C000L});
        public static final BitSet FOLLOW_14_in_ruleElementGroup2501 = new BitSet(new long[]{0x00000002FC000000L});
        public static final BitSet FOLLOW_ruleViewElement_in_ruleElementGroup2522 = new BitSet(new long[]{0x000000000200C000L});
        public static final BitSet FOLLOW_25_in_ruleElementGroup2539 = new BitSet(new long[]{0x0000082000000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleElementGroup2560 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElementGroup2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewElement_in_entryRuleViewElement2610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewElement2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationElement_in_ruleViewElement2667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyElement_in_ruleViewElement2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationElement_in_entryRuleAssociationElement2729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociationElement2739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleAssociationElement2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_ruleAssociationElement2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList2848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleList2895 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList2912 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleList2934 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleList2951 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleList2974 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleList2986 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleList3008 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleList3021 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleList3042 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleList3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable3094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable3104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleTable3141 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTable3158 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable3180 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTable3197 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable3220 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable3232 = new BitSet(new long[]{0x0000001010008000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleTable3255 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTable3268 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleTable3289 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleTable3321 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable3333 = new BitSet(new long[]{0x0000001010000000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable3357 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTable3370 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable3391 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable3423 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTable3436 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable3457 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTable3474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyElement_in_entryRulePropertyElement3510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyElement3520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rulePropertyElement3567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rulePropertyElement3594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_rulePropertyElement3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTimePicker_in_rulePropertyElement3648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn3683 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn3693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleColumn3730 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleColumn3747 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleColumn3769 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleColumn3786 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleColumn3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTimePicker_in_entryRuleDateTimePicker3845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateTimePicker3855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDateTimePicker3892 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimePicker3909 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimePicker3931 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimePicker3953 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDateTimePicker3970 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDateTimePicker3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText4029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleText4082 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleText4108 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleText4125 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText4147 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_ruleText4165 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText4182 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleText4201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleText4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection4260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection4270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSelection4307 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSelection4324 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection4346 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSelection4363 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelection4386 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSelection4398 = new BitSet(new long[]{0x0000000C00008000L});
        public static final BitSet FOLLOW_ruleSelectionItem_in_ruleSelection4420 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSelection4433 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_ruleSelectionItem_in_ruleSelection4454 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSelection4470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionItem_in_entryRuleSelectionItem4506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionItem4516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralItem_in_ruleSelectionItem4563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleSelectionItem4581 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSelectionItem4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralItem_in_entryRuleEnumerationLiteralItem4640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralItem4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEnumerationLiteralItem4687 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationLiteralItem4704 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerationLiteralItem4721 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEnumerationLiteralItem4744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink4792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLink4829 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLink4846 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLink4863 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink4886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout4924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout4934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleLayout4979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition5014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition5024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_ruleCondition5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_entryRuleVisibilityCondition5104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityCondition5114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleVisibilityCondition5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonCondition_in_ruleVisibilityCondition5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition5223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition5233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCompositeCondition5270 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeCondition5287 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleCompositeCondition5304 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleCompositeCondition5316 = new BitSet(new long[]{0x00000A2000000000L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition5338 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition5359 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_40_in_ruleCompositeCondition5372 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition5393 = new BitSet(new long[]{0x0000082000000000L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition5414 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_41_in_ruleCompositeCondition5430 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCompositeCondition5442 = new BitSet(new long[]{0x0007800000000000L});
        public static final BitSet FOLLOW_ruleVisibilityConditionType_in_ruleCompositeCondition5463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonCondition_in_entryRuleComparisonCondition5499 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonCondition5509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleComparisonCondition5546 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComparisonCondition5563 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleComparisonCondition5580 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComparisonCondition5600 = new BitSet(new long[]{0x00E0000000000000L});
        public static final BitSet FOLLOW_ruleComparisonConditionType_in_ruleComparisonCondition5621 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleComparisonCondition5638 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleComparisonCondition5655 = new BitSet(new long[]{0x0007800000000000L});
        public static final BitSet FOLLOW_ruleVisibilityConditionType_in_ruleComparisonCondition5676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5766 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleQualifiedName5794 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5810 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_45_in_ruleLayoutStyle5871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleLayoutStyle5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleVisibilityConditionType5933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleVisibilityConditionType5950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleVisibilityConditionType5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleVisibilityConditionType5984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCompositeConditionType6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCompositeConditionType6046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleComparisonConditionType6091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleComparisonConditionType6108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleComparisonConditionType6125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_synpred1_InternalView5785 = new BitSet(new long[]{0x0000000000000002L});
    }


}