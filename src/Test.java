import java.util.HashMap;


import junit.framework.TestCase;
import static org.junit.Assert.*;

public class Test extends TestCase{

	public void setUp() throws Exception{
		System.out.println("setup");
	}
	public void tearDown() throws Exception{
		System.out.println("tearDown");
	}
	
	public void testAdd(){
		System.out.println("add");
		int x=0;
		int y=1;
		int result = x+y;
		assertEquals(1,result);
	}
	public void test(){
		assertEquals(0,1/0);
		assertEquals(3,5);
	}
	public void test1(){
		assertArrayEquals("ss", new Object[]{1}, new Object[]{2});
	}
}
