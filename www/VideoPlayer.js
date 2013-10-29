var videoplayer=  {
    play: function(json, successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'VideoPlayer', // mapped to our native Java class called "Calendar"
            'play', // with this action name
            [json]  
        );
    }
}
module.exports = videoplayer;