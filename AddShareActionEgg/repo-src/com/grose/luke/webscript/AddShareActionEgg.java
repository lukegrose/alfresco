package com.grose.luke.webscript;

import java.io.IOException;

import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.cmr.workflow.WorkflowService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.extensions.webscripts.AbstractWebScript;
import org.springframework.extensions.webscripts.WebScriptRequest;
import org.springframework.extensions.webscripts.WebScriptResponse;

public class AddShareActionEgg extends AbstractWebScript {
	
    private static Log logger = LogFactory.getLog(AddShareActionEgg.class);

    private NodeService nodeService;
    private WorkflowService workflowService;

    public void setNodeService(NodeService nodeService) {
    	logger.trace( "Node service is being set in the [add-share-action] webscript" );
        this.nodeService = nodeService;
    }

    public void setWorkflowService(WorkflowService workflowService) {
    	logger.trace( "Workflow service is being set in the [add-share-action] webscript" );
    	this.workflowService = workflowService;
    }
    
    public void execute(final WebScriptRequest req, final WebScriptResponse res)
            throws IOException {
    	
    	logger.trace( "You have reached the webscript [add-share-action]" );
    }
    
}