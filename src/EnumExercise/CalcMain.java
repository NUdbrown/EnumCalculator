package EnumExercise;

import java.util.Scanner;

public class CalcMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static Calculator cal = new Calculator();
	
	
	
	public static void main(String[]args)
	{
		boolean done = false;
		
		System.out.println("Welcome to Dia's Calculator. Start out by choosing two numbers.");
		System.out.println("If you want to close the calulator type done, if not then press enter to begin calculating.");
		while(!done)
		{
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("done"))
			{
				done = true;
				scan.close();
			}
			else
			cal.doCalculation();
					
		}
		scan.close();
		
		

		
		
	}


	

	 

}


