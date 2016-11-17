package units;

import static org.junit.Assert.*;
import org.junit.Test;
import application.MathProvider;

public class JunitMathProviderTest1 {
	
	MathProvider provider;
	
	public JunitMathProviderTest1(){
		
		provider = new MathProvider();
	}
	
	@Test
	public void add(){
		System.out.println("Starting test "+ new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber =10;
		int secondNumber =20;
		assertEquals(firstNumber + secondNumber, provider.Add(firstNumber,secondNumber));
		System.out.println("Ending Test "+ new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void subtract(){
		System.out.println("Starting  test "+ new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber =40;
		int secondNumber=50;
		assertEquals(firstNumber - secondNumber,provider.Substract(firstNumber, secondNumber));
		System.out.println("Ending Test "+ new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
