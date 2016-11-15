if(!window.plugins) {
	window.plugins = {};
}

if (!window.plugins.pushNotification) {
	window.plugins.pushNotification = 
	
	{
			register: function(successCallback, errorCallback, options) {
		    	if (errorCallback == null) { errorCallback = function() {}}

				if (typeof errorCallback != "function")  {
					console.log("PushNotification.register failure: failure parameter not a function");
					return;
				}

				if (typeof successCallback != "function") {
					console.log("PushNotification.register failure: success callback parameter must be a function");
					return;
				}

				cordova.exec(successCallback, errorCallback, "PushPlugin", "register", [options]);
			},
			
			
			// Call this to setup the plugin without registering with APNS or GCM.
			// The [options] are the same as for the register function.
			// This is useful for faster plugin startup on Android but not required if already using register
			setup: function(successCallback, errorCallback, options) {
			    if (errorCallback == null) { errorCallback = function() {}}

			    if (typeof errorCallback != "function") {
			        console.log("PushNotification.setup failure: failure parameter not a function");
			        return
			    }

			    if (typeof successCallback != "function") {
			        console.log("PushNotification.setup failure: success callback parameter must be a function");
			        return
			    }

			    cordova.exec(successCallback, errorCallback, "PushPlugin", "setup", [options]);
			},
			

		    unregister: function(successCallback, errorCallback) {
				if (errorCallback == null) { errorCallback = function() {}}

				if (typeof errorCallback != "function")  {
					console.log("PushNotification.unregister failure: failure parameter not a function");
					return;
				}

				if (typeof successCallback != "function") {
					console.log("PushNotification.unregister failure: success callback parameter must be a function");
					return;
				}

				cordova.exec(successCallback, errorCallback, "PushPlugin", "unregister", []);
		    },
		    
		    setApplicationIconBadgeNumber: function(successCallback, badge) {
				if (errorCallback == null) { errorCallback = function() {}}

				if (typeof errorCallback != "function")  {
					console.log("PushNotification.setApplicationIconBadgeNumber failure: failure parameter not a function");
					return;
				}

				if (typeof successCallback != "function") {
					console.log("PushNotification.setApplicationIconBadgeNumber failure: success callback parameter must be a function");
					return;
				}

				cordova.exec(successCallback, successCallback, "PushPlugin", "setApplicationIconBadgeNumber", [{badge: badge}]);
		    },
   };
};
