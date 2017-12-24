import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class MyClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(2);
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(3);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(4);
	}

	@Test
	public void testM1() {
		fail("Not yet implemented");
	}
	@Test(timeout=1)
	public void testM2(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(null);
	}
	@Ignore("dfdsf")
	@Test(expected=ArithmeticException.class)
	public void testM3(){
		System.out.println(1/0);
	}
    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
    }

}
