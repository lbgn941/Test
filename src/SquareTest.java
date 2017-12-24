import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class SquareTest {
	private int param;
	private int result;
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{2,4},
				{0,0},
				{-3,9}
		});
	}
	public SquareTest(int param,int result){
		this.param = param;
		this.result = result;
	}
	
	@Test
	public void square(){
		System.out.println(Math.pow(param, 2));
		assertEquals(result,Math.pow(param, 2));
	}
}
