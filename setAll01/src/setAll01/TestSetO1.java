package setAll01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSetO1 {
	O1arr arr =null;
	
	@Before
	public void setUp() throws Exception {
		arr= new O1arr(100000000); 
		
	}
	
	@Test
	public void test() {
		 
		arr.set(999, 1);
		
		Integer i = arr.get(999);
		
		assert(i==1);
		
		arr.setAll(888);
		
		assert ( arr.get(999)== 888);
		
		assert ( arr.get(99999)== 888);
		
		arr.set( 10, 22);
		
		assert ( arr.get(99999)== null);
		
		assert ( arr.get(10)== 22);
		
		
	}
	
	

}
