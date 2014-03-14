package au.gov.wa.cityofperth.webscript;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

public class FifthElementWebscriptController extends DeclarativeWebScript {
	
	private static Log logger = LogFactory.getLog( FifthElementWebscriptController.class );
	
	@Override
	protected Map<String, Object> executeImpl(WebScriptRequest req,
			Status status, Cache cache) {
		
		logger.trace( "TEMPLATE VARS: " );
		
		Map<String, String> templateVars = req.getServiceMatch().getTemplateVars();
		
		for( Map.Entry<String, String> entry : templateVars.entrySet() ) {
			
			logger.trace( "Key: " + entry.getKey() + ", Value: " + entry.getValue() );
			
		}
		
		logger.trace( "ARG VARS: " );
		
		for( String paramName : req.getParameterNames() ) {
			
			logger.trace( "Name: " + paramName + ", Value: " + req.getParameter( paramName ) );
			
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put( "breakfast", "diet coke" );
		
		return data;
		
	}
}
