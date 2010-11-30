package me.mailee;

public class Mailee {
	public static final Integer ALL = -1;
	private static String apiURI;

	public static void setApiURI(String apiURI) {
		Mailee.apiURI = apiURI;
	}

	public static String getApiURI() {
		return apiURI;
	}

	public static String setApiURI(String user, String key) {
		Mailee.apiURI = "http://api." + key + "." + user + ".mailee.me/contacts";
		return apiURI;
	}
}
