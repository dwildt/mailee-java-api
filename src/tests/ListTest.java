package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.jactiveresource.*;

import me.mailee.List;

public class ListTest {

	private ResourceConnection c;
	private ResourceFactory f;
	private List l;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		org.apache.log4j.BasicConfigurator.configure();
		c = new ResourceConnection(
				"http://api.33be075a32df5.unittests.mailee.me");
		f = new ResourceFactory(c, (Class) List.class);
	}

	@Test
	public void basicOperations() throws Exception {
		l = f.instantiate();
		assertNull(l.getId());
		l.setName("Monty Python List");
		l.save();

		String id = l.getId();
		assertNotNull("No id present", l.getId());

		l = f.find(id);
		assertEquals(l.getName(), "Monty Python List");
		l.setName("Another List");
		l.save();

		l = f.find(id);
		assertEquals(l.getName(), "Another List");

		assertTrue(f.exists(id));
		l.delete();
	}
}
