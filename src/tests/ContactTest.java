package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.jactiveresource.*;

import me.mailee.Contact;

public class ContactTest {

	private ResourceConnection c;
	private ResourceFactory f;
	private Contact p;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		org.apache.log4j.BasicConfigurator.configure();
		c = new ResourceConnection(
				"http://api.33be075a32df5.unittests.mailee.me");
		f = new ResourceFactory(c, (Class) Contact.class);
	}

	@Test
	public void basicOperations() throws Exception {
		p = f.instantiate();
		assertNull(p.getId());
		p.setName("Monty Python");
		p.setEmail("monty@python.org");
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
	}
}
