package com.orange.labs.plugins;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;


public class VideoPlayer  extends CordovaPlugin{

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		// log.d("---ANDROID PLUG IN", args.toString());
		final JSONObject arg_object = args.getJSONObject(0);
		Log.d("VideoPlayer", "playing video" + arg_object.getString("url"));
		Intent tostart = new Intent(Intent.ACTION_VIEW);
		tostart.setDataAndType(Uri.parse(arg_object.getString("url")), "video/*");
		tostart.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		 Context context=this.cordova.getActivity().getApplicationContext();
		    //or Context context=cordova.getActivity().getApplicationContext();
		 context.startActivity(tostart);
		callbackContext.success(); // Thread-safe.
		
		
		return true;
	}


	

}
