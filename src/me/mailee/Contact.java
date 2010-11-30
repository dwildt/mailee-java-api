package me.mailee;

import org.json.JSONException;
import org.json.JSONObject;

public class Contact {
	private JSONObject json = null;

	public Contact(String jsonSource) throws JSONException {
		json = new JSONObject(jsonSource);
	}

	public JSONObject getJSON() {
		return json;
	}
	public Contact set(String key, String value) throws JSONException {
		json.put(key, value);
		return this;
	}

	public String get(String key) {
		return json.optString(key);
	}	
}
