package com.grose.luke.documentlibrary.action.evaluator;

import org.alfresco.web.evaluator.BaseEvaluator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;

/**
 * Check if document that the action is being applied to has
 * the cm:emailed aspect set.
 *
 * @author ecmstuff.blogspot.com
 */
public class AddShareActionEggEvaluator extends BaseEvaluator {
	
    private static Log logger = LogFactory.getLog( AddShareActionEggEvaluator.class );
    
    public void init() {
		logger.info( "INIT has been called for [AddShareActionEggEvaluator]" );
	}
    
    @Override
    public boolean evaluate(JSONObject jsonObject) {
    	logger.trace( "Entered the [AddShareActionEggEvaluator] evaluator" );
    	return true;
    }
    
}
