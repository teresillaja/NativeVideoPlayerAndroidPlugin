import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;


public class VideoPlayer  extends CordovaPlugin{

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		// log.d("---ANDROID PLUG IN", args.toString());
		final JSONObject arg_object = args.getJSONObject(0);
		Log.d("VideoPlayer", "playing video");
		callbackContext.success(); // Thread-safe.
		
		
		return true;
	}


	

}
