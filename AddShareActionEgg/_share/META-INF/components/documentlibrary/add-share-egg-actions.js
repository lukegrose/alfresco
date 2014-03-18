/**
 * Document Browse and Details page email actions
 *
 * @author ecmstuff.blogspot.com
 */
(function() {
    
	YAHOO.Bubbling.fire("registerAction", {
		
		actionName: "_callAddShareActionWebscript",
		fn: function dlA_callAddShareActionWebscript(file) {

			console.log( "About to set custom properties [" + file.nodeRef + "]" );
			var url = "/alfresco/service/add-share-action?msg=thisismymessagetoyou";
			console.log( "The url to be called [" + url + "]" );
			
			Alfresco.util.Ajax.request({
				url: url,
				method: 'get',
				successCallback: {
				
				},
				successMessage: "Webscript successfully called using custom action",
				failureMessage: "Couldn't call custom action",
				failureCallback: {
					
				}
				
			});
			
		}
	
    });
    
	YAHOO.Bubbling.fire("registerAction",
	{
		actionName: "onActionAddShareActionEgg",
		fn: function dlA_onActionAddShareActionEgg(file) 
	    {
				var me = this;
			
				console.log( "I think this method is duff somehow" );
				
				Alfresco.util.PopupManager.displayPrompt(
	        	{
	        	     title: this.msg("Add Share Action Egg"),
	        	     text: this.msg("Ready to go?"),
	        	     buttons: [
	        	     {
	        	    	 
	        	    	 text: this.msg("Yes"),
	        	         handler: function dlA_onActionDelete_delete()
	        	         {
	        	        	 
	        	        	 this.destroy();
	        	             
	        	        	 me._callAddShareActionWebscript.call(me, file);

    	 		          }
	        	      },
	        	      {
	        	          text: this.msg("button.cancel"),
	        	          handler: function dlA_onActionDelete_cancel()
	        	          {
	        	              this.destroy();
	        	          },
	        	          isDefault: true
	        	      }]
	        	});
	        	
			}
	});
	
})();

	