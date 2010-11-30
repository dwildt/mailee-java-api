package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import org.jactiveresource.*;

import me.mailee.List;
import me.mailee.Message;

public class MessageTest {

	private ResourceConnection c1, c2;
	private ResourceFactory f, lf;
	private Message m;
	private List l;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		org.apache.log4j.BasicConfigurator.configure();
		c1 = new ResourceConnection(
				"http://api.33be075a32df5.unittests.mailee.me");
		c2 = new ResourceConnection(
		"http://api.33be075a32df5.unittests.mailee.me");

		f = new ResourceFactory(c1, (Class) Message.class);
		lf = new ResourceFactory(c2, (Class) List.class);
		l = lf.instantiate();
		l.setName("Monty Python List");
		l.save();
	}

	@After
	public void tearDown() throws Exception {
		l.delete();
	}

	@Test
	public void basicOperations() throws Exception {
		m = f.instantiate();
		assertNull(m.getId());
		m.setTitle("Monty Python Message");
		m.setFromName("Parrot");
		m.setFromEmail("parrot@funny.org");
		m.setSubject("No, he is not dead");
		m.setListId(Integer.decode(l.getId()));
		m.save();

		String id = m.getId();
		assertNotNull("No id present", m.getId());

		m = f.find(id);
		assertEquals(m.getTitle(), "Monty Python Message");
		m.setTitle("Another Message");
		m.save();

		m = f.find(id);
		assertEquals(m.getTitle(), "Another Message");

		assertTrue(f.exists(id));
		m.delete();
	}
}
