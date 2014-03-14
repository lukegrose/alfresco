package au.gov.wa.cityofperth.webscript;

import java.util.HashMap;
import java.util.Map;

import org.alfresco.service.cmr.repository.NodeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptException;
import org.springframework.extensions.webscripts.WebScriptRequest;

public class ReturnWebscriptController extends DeclarativeWebScript  {
	
	private static Log logger = LogFactory.getLog(ReturnWebscriptController.class);

	private NodeService nodeService;
    
    public void setNodeService(NodeService nodeService) {
        this.nodeService = nodeService;
    }
    
    @Override
    protected Map<String, Object> executeImpl(WebScriptRequest req, Status status, Cache cache) {
       
    	logger.trace( "Entered the Return of the Jedi WebScript" );
    	
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("Chebacca", "Howllll!");
        model.put("Han", "Boy, you said it Chewie");
        
        if ( nodeService == null ) {
		    throw new WebScriptException( Status.STATUS_NOT_FOUND, "Node Service dependency was not injected" );
	    }
       
        return model;
    }
	
}
