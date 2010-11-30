package tests;

import java.util.Iterator;

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
import org.json.JSONException;
import org.json.JSONObject;

import me.mailee.Contact;

public class ContactTest {
	private JSONObject initial;
	private Contact c = null;
	@Before
	public void setUp() throws Exception {
		initial = new JSONObject("{\"skoob_connections\":null,\"position\":null,\"name\":\"diogob\",\"kscore\":null,\"forwarded_by\":null,\"contact_status_id\":2,\"company\":null,\"address\":\"\",\"photo_file_size\":null,\"latitude\":null,\"created_at\":\"2010-11-25T17:31:57-02:00\",\"twitter_followers\":null,\"origin_id\":2,\"linkedin_followers\":null,\"goodreads_connections\":null,\"updated_at\":\"2010-11-25T17:32:05-02:00\",\"photo_file_name\":null,\"notes\":\"\",\"linkedin_recomendations\":null,\"import_id\":null,\"deleted_at\":null,\"photo_content_type\":null,\"dynamic_values\":null,\"id\":4337834,\"sex\":null,\"photo_updated_at\":null,\"mobile\":\"\",\"facebook_followers\":null,\"client_id\":1966,\"phone\":null,\"birthday\":null,\"longitude\":null,\"plaxo_connections\":null,\"orkut_followers\":null,\"internal_id\":\"\",\"age\":null,\"email\":\"diogob@gmail.com\"}");
		c = new Contact(this.initial.toString());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContact_getJSON() throws Exception {
		assertEqualJSON(initial, c.getJSON());
	}

	@Test
	public void testContact_getAttributes() throws Exception {
		Assert.assertEquals("diogob", c.get("name"));
	}

	@Test
	public void testContact_setAttributes() throws Exception {
		Assert.assertEquals("TEST CONTACT", c.set("name", "TEST CONTACT").get("name"));
	}

	@Test
	public void testContactGet() throws Exception {
		Request request = new Request(Method.GET, "http://api.33be075a32df5.unittests.mailee.me/contacts");
		// Indicates the client preferences and let the server handle the best representation with content negotiation.
		request.getClientInfo().getAcceptedMediaTypes().add(new Preference<MediaType>(MediaType.APPLICATION_JSON));
		Response response = new Response(request);
		Client c = new Client("HTTP");
		c.handle(request, response);
		JsonRepresentation represent = new JsonRepresentation(response.getEntity());
		JSONArray contacts = represent.getJsonArray();
		System.out.println(contacts.length());
	}
	
	/*
	 * Compare two JSON objects assuming we can get every value as a string
	 * I did not find another way to do this as toString in JSONObject does not guarantee order
	 * And the JSONObject.equals is broken
	 */
	private void assertEqualJSON(JSONObject jso1, JSONObject jso2) throws JSONException {
		Iterator keys = jso1.keys();
		while(keys.hasNext()){
			String element = (String) keys.next();
			Assert.assertEquals(jso1.getString(element), jso2.getString(element));
		}
	}
}
