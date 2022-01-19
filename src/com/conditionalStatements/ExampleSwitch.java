package com.conditionalStatements;

		import java.util.Scanner;

		public class ExampleSwitch
		{

			//switch statement
			public static void main(String[] args)
			{
				
				/**
				 * Write a java program to print a day name by 
				 * entering a number(1 to 7).
				 */
				
				int number;
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter a number(in between 1 to 7):");
				number = scanner.nextInt();
				
				switch(number)
				{
					case 1:
						System.out.println("Monday");
						break;
						
					case 2:
						System.out.println("Tuesday");
						break;
						
					case 3:
						System.out.println("Wednesday");
						break;
						
					case 4:
						System.out.println("Thursday");
						break;
					
					case 5:
						System.out.println("Friday");
						break;
						
					case 6:
						System.out.println("Saturday");
						break;
					
					case 7:
						System.out.println("Sunday");
						break;
						
					default:
						System.out.println("Enter valid number.");
						
				}
				
				scanner.close();
				
			}

		}


