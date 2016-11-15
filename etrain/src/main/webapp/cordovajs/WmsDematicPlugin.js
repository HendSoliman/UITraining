/**
 * DematicPlugin.js
 * 
 * Phonegap Dematic Plugin Instance plugin Copyright (c) Dematic 2012
 * 
 */

// Attach the WmsDematic Plugin to the window.plugins, otherwise it won't be recognized within GWT(!)
if (!window.plugins) window.plugins = {};

if (!window.plugins.WmsDematicPlugin) {
    window.plugins.WmsDematicPlugin =
{
        log: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "log", types);
		},

		showBusyIndicator: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "showBusyIndicator", types);
		},

		hideBusyIndicator: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "hideBusyIndicator", types);
		},

		openURL: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "openURL", types);    
		},
		
		openPDF: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "openPDF", types);    
		},
		
		openImage: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "openImage", types);    
		},
		
		openVideo: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "openVideo", types);    
		},
		
		closeWebView: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "closeWebView", types);    
		},
		
		getAvailableWarehouses: function(types, success, fail)
		{
			return Cordova.exec(success, fail, "WmsDematicPlugin", "getAvailableWarehouses", types);    
		},
		
   };
};

