package units;
import static org.junit.Assert.*;
import org.junit.Test;
import application.MathProvider;

public class JunitMathProviderTest2 {
	
	MathProvider provider;
	
	public JunitMathProviderTest2(){
		provider = new MathProvider();
	}
	
	@Test
	public void multiply(){
		System.out.println("Starting test "+ new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 4;
		int secondNumber = 12;
		assertEquals(firstNumber*secondNumber,provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test "+ new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void divide(){
		System.out.println("Starting test "+ new Object(){}.getClass().getEnclosingMethod().getName());
		int firstN=10;
		int secondN=20;
		assertEquals(firstN/secondN,provider.Divide(firstN, secondN));
		System.out.println("Ending test "+ new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
