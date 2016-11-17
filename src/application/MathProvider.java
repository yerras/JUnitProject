package application;

/*
 *  This is a sample class used for unit tests
 *  Define 3 basic methods
 *  Subtract()
 *  Add()
 *  Multiply()
 *  
 *  Our goal is to have unit tests around these 
 *  basic methods
 */

public class MathProvider {	

	public MathProvider(){}

	public int Substract(int firstNumber, int secondNumber)
	{
		return (firstNumber - secondNumber);		
	}

	public int Add(int firstNumber, int secondNumber)
	{
		return (firstNumber + secondNumber);
	}

	public int Multiply(int firstNumber, int secondNumber)
	{
		return (firstNumber * secondNumber);
	}

}