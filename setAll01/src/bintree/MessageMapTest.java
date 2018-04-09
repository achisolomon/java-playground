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
		msgmap.addMessageToSender("Achi1", "someone ", "hi");
		msgmap.addMessageToSender("Achi2", "someone ", "hi");
		msgmap.addMessageToSender("Achi2", "someone ", "hi");
		msgmap.addMessageToSender("Achi3", "someone ", "hi");
		msgmap.addMessageToSender("Achi3", "someone ", "hi");
		msgmap.addMessageToSender("Achi3", "someone ", "hi");
		msgmap.addMessageToSender("Achi4", "someone ", "hi");
		msgmap.addMessageToSender("Achi4", "someone ", "hi");
		msgmap.addMessageToSender("Achi4", "someone ", "hi");
		msgmap.addMessageToSender("Achi4", "someone ", "hi");
		
		msgmap.addMessageToSender("Achi5", "someone ", "hi");
		msgmap.addMessageToSender("Achi5", "someone ", "hi");
		msgmap.addMessageToSender("Achi5", "someone ", "hi");
		msgmap.addMessageToSender("Achi5", "someone ", "hi");
		msgmap.addMessageToSender("Achi5", "someone ", "hi");
		msgmap.addMessageToSender("Veronique", "someone ", "hi");
		msgmap.addMessageToSender("Orianne", "someone ", "hi");
		msgmap.addMessageToSender("Eden", "someone ", "hi");
		msgmap.addMessageToSender("Frida", "someone ", "hi");
		msgmap.addMessageToSender("Kobi", "someone ", "hi");
		
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
		assertTrue("check if the list size is 4 ", l.size() == 4);
		assertTrue("check if the list size is 4 ", l.contains("Achi2"));
		assertTrue("check if the list size is 4 ", l.contains("Achi3"));
		assertTrue("check if the list size is 4 ", l.contains("Achi4"));
	}

}
