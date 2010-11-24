package tests;

import org.junit.After;
import org.junit.Before;
import junit.framework.Assert;
import org.junit.Test;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Client;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Preference;
import org.restlet.ext.json.JsonRepresentation;
import org.json.JSONArray;


public class ContactTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContactGet() throws Exception {
		Request request = new Request(Method.GET, "http://api.key_goes_here.diogobiazus.mailee.me/contacts");
		// Indicates the client preferences and let the server handle the best representation with content negotiation.
		request.getClientInfo().getAcceptedMediaTypes().add(new Preference<MediaType>(MediaType.APPLICATION_JSON));
		Response response = new Response(request);
		Client c = new Client("HTTP");
		c.handle(request, response);
		JsonRepresentation represent = new JsonRepresentation(response.getEntity());
		JSONArray contacts = represent.getJsonArray();
		System.out.println(contacts.length());
	}
}
