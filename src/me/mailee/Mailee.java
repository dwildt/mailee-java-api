package me.mailee;

import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Preference;

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

	public static String getContacts(Integer listId) {
		Request request = new Request(Method.GET, "http://api.33be075a32df5.unittests.mailee.me/contacts");
		// Indicates the client preferences and let the server handle the best representation with content negotiation.
		request.getClientInfo().getAcceptedMediaTypes().add(new Preference<MediaType>(MediaType.APPLICATION_JSON));
		Response response = new Response(request);
		Client c = new Client("HTTP");
		c.handle(request, response);
		System.out.print(response.getEntityAsText());
		return "";		
	}
}
