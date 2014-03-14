Notes
(1) The "Empire" example is backed by a Java class that extends AbstractWebScript.
The return type is void. Java-backed webscripts implemented like this DO NOT use
a freemarker template. Anything returned to them is written to the writer of the 
WebScriptResponse.

(2) The "Fifth Element" example is backed by a Java class that extends DeclarativeWebScript.
This time the return type is Map<String, Object>

(3) URL examples are discussed below.
<!--
	That's nice. It rhymes
  -->
/content/a/b/c/d.txt

<!-- 
	Query parameters are not mandatory and are not enforced. They
	serve as documentation only.
-->
/sample/helloworld?to={name}

<!-- 
	The above comment noted...the ? after the name parameter denotes
	optional. I am guessing for some future purpose.
-->
/sample/helloworld?to={name?}

<!-- 
	Html enconding is used for the &
-->
/blog/search?q={searchTerm}&amp;n={numResults}

<!-- 
	This one includes "URI Path Tokens" which can be accessed in the Web Script using
	Map<String, String> templateVars = req.getServiceMatch().getTemplateVars();
-->
/people/{personName}/profile/{profileStyle}