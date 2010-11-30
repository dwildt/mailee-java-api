package tests;

import static org.junit.Assert.*;

import java.util.Date;
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

import org.jactiveresource.*;

import me.mailee.Contact;

public class ContactTest {

		  private ResourceConnection c;
		  private ResourceFactory f;
		  private Contact p;

		  @SuppressWarnings("unchecked")
		  @Before
		  public void setUp() throws Exception {
		    c = new ResourceConnection("http://localhost:3000");
		    f = new ResourceFactory(c, (Class) Contact.class);
		  }

		  @Test
		  public void basicOperations() throws Exception {
			System.out.println("TESTE");
		    p = f.instantiate();
		    assertNull(p.getId());
		    p.setName("Monty Python");
		    Date old = new Date(new Long("-99999999999999"));
		    p.setBirthdate(old);
		    p.save();

		    String id = p.getId();
		    assertNotNull("No id present", p.getId());

		    p = f.find(id);
		    assertEquals(p.getName(), "Monty Python");
		    p.setName("Alexander the Great");
		    p.save();

		    p = f.find(id);
		    assertEquals(p.getName(), "Alexander the Great");

		    assertTrue(f.exists(id));
		    p.delete();
		    assertFalse(f.exists(id));
		  }
		}

