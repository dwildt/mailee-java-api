package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.jactiveresource.*;

import me.mailee.Template;

public class TemplateTest {

	private ResourceConnection c;
	private ResourceFactory f;
	private Template t;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		org.apache.log4j.BasicConfigurator.configure();
		c = new ResourceConnection(
				"http://api.33be075a32df5.unittests.mailee.me");
		f = new ResourceFactory(c, (Class) Template.class);
	}

	@Test
	public void basicOperations() throws Exception {
		t = f.instantiate();
		assertNull(t.getId());
		t.setTitle("Monty Python Template");
		t.setHtml("<html><head><title></title></head><body>wink, wink, nudge, nudge</body></html>");
		t.save();

		String id = t.getId();
		assertNotNull("No id present", t.getId());

		t = f.find(id);
		assertEquals(t.getTitle(), "Monty Python Template");
		t.setTitle("Another Template");
		t.save();

		t = f.find(id);
		assertEquals(t.getTitle(), "Another Template");

		assertTrue(f.exists(id));
		t.delete();
	}
}
