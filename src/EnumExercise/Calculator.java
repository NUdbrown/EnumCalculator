package EnumExercise;

import java.util.Scanner;

public class Calculator {
	private Scanner scan = new Scanner(System.in);
	
	public void promptNumOne()
	{
		System.out.println("Enter first number:");
			
	}
	
	public void promptNumTwo()
	{
		System.out.println("Enter second number:");
	}

	
	public void doCalculation()
	{
		int a = 0;
		int b = 0;
		int result = 0;
	
		
		try{	
			promptNumOne();
			String inputA = scan.nextLine();
			a = Integer.parseInt(inputA);
			promptNumTwo();
			String inputB = scan.nextLine();
			b = Integer.parseInt(inputB);
			
			System.out.println("Choose a method of calculataion: ADD, SUBTRACT, DIVIDE, or MULTIPLY.");
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("add"))
			{			
				result = Operations.ADD.calculate(a,b);			
				
			}
			else if(input.equalsIgnoreCase("subtract"))
			{
				result = Operations.SUBTRACT.calculate(a, b);
			}
			else if(input.equalsIgnoreCase("divide"))
			{
				result = Operations.DIVIDE.calculate(a, b);
			}
			else if(input.equalsIgnoreCase("multiply"))
			{
				result = Operations.MULTIPLY.calculate(a, b);
			}
			
			System.out.println("The answer: " + result);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Please enter a number!");
		}
		

		
		
	}
	
	

}
