cordova.define("com.orange.labs.plugins.videoplayer.VideoPlayer", function(require, exports, module) {var videoPlayerAndroid = {
    createEvent: function(json,successCallback, errorCallback) {
 			cordova.exec(
            // success callback function
             function() {
            	successCallback();
       		 },
       		 function(){
       		 	errorCallback();
       		 }, // error callback function
            'VideoPlayer', // mapped to our native Java class called "HttpRequest"
            'play', // with this action name
            [json]           // and this array of custom arguments to create our entry
            );    
    }
}
module.exports = videoPlayerAndroid;});
