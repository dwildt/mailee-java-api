package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import me.mailee.Mailee;

public class MaileeTest {
	@Test
	public void testSetURI() throws Exception {
		Mailee.setApiURI("http://api.33be075a32df5.unittests.mailee.me/contacts");
		assertEquals("http://api.33be075a32df5.unittests.mailee.me/contacts", Mailee.getApiURI());
	}

	@Test
	public void testSetURIByUser() throws Exception {
		Mailee.setApiURI("unittests", "33be075a32df5");
		assertEquals("http://api.33be075a32df5.unittests.mailee.me/contacts", Mailee.getApiURI());
	}
	@Test
	public void getContactList() throws Exception {
		Mailee.setApiURI("unittests", "33be075a32df5");
		Mailee.getContactList(Mailee.ALL);
	}
}
