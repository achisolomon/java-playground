/**
 * 
 */
package bintree;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author achisolomon
 *
 */
public class MessageMapTest {

	MessageMap msgmap = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		msgmap = new MessageMap();
		msgmap.addMessageToSender("Achi1");
		msgmap.addMessageToSender("Achi2");
		msgmap.addMessageToSender("Achi2");
		msgmap.addMessageToSender("Achi3");
		msgmap.addMessageToSender("Achi3");
		msgmap.addMessageToSender("Achi3");
		msgmap.addMessageToSender("Achi4");
		msgmap.addMessageToSender("Achi4");
		msgmap.addMessageToSender("Achi4");
		msgmap.addMessageToSender("Achi4");
		
		msgmap.addMessageToSender("Achi5");
		msgmap.addMessageToSender("Achi5");
		msgmap.addMessageToSender("Achi5");
		msgmap.addMessageToSender("Achi5");
		msgmap.addMessageToSender("Achi5");
		msgmap.addMessageToSender("Veronique");
		msgmap.addMessageToSender("Orianne");
		msgmap.addMessageToSender("Eden");
		msgmap.addMessageToSender("Frida");
		msgmap.addMessageToSender("Kobi");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		List l =  msgmap.getTenPrecentSenders();
		assertTrue("chcek if the list size is 4 ", l.size() == 4);
		assertTrue("chcek if the list size is 4 ", l.contains("Achi2"));
		assertTrue("chcek if the list size is 4 ", l.contains("Achi3"));
		assertTrue("chcek if the list size is 4 ", l.contains("Achi4"));
		assertTrue("chcek if the list size is 4 ", l.contains("Achi5"));
	}

}
