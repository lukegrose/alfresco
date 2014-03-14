package au.gov.wa.cityofperth.webscript;

import java.io.IOException;

import org.alfresco.service.cmr.repository.NodeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.extensions.webscripts.AbstractWebScript;
import org.springframework.extensions.webscripts.WebScriptException;
import org.springframework.extensions.webscripts.WebScriptRequest;
import org.springframework.extensions.webscripts.WebScriptResponse;

public class EmpireWebscriptController extends AbstractWebScript {
	
	private static Log logger = LogFactory.getLog( EmpireWebscriptController.class );

	private NodeService nodeService;
    
    public void setNodeService(NodeService nodeService) {
        this.nodeService = nodeService;
    }
	
	@Override
	public void execute(WebScriptRequest req, WebScriptResponse resp)
			throws IOException {
		
		logger.trace( "The java code for the Empire Strikes Back has been reached" );
		
		try
    	{
	    	JSONObject obj = new JSONObject();
	    	obj.put( "vader", "No, I am your father!" );
	    	obj.put( "luke", "Noooooo!" );
	    	String jsonString = obj.toString();
	    	resp.getWriter().write( jsonString );
    	}
    	catch(JSONException e)
    	{
    		throw new WebScriptException("Unable to serialize JSON");
    	}
		
	}

}
