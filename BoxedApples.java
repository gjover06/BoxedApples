/**
 Author: George Samu 
 Purpose: The purpose is to collect data on the
 numbers of apples in a box,price per apple, cost of box
 of apples
 date: 5/20/2020
*/
import java.util.Scanner;

public class BoxedApples
{
		public static void main (String[]args)
		{
		 Scanner keyboard=new Scanner(System.in);
		 System.out.println("How many apples in a box?");
		 int ApplesInBox =keyboard.nextInt();
		 
		 System.out.println("How much is it per apple?");
		 double CostPerApple=keyboard.nextDouble();
		 
		 System.out.println("Cost of box of apples");
		 double CostperBox=keyboard.nextDouble();
		 
		 //Calculating cost of apples
		 double CostOfApples= CostPerApple * ApplesInBox;
		 
		 //Calculating how much saved
		 double savings = CostOfApples-CostperBox;
		 
		 System.out.println();
		 
		 System.out.println("Apples in the box:     "+ApplesInBox);
		
		 System.out.println("Cost Per Apples:      "+CostPerApple);
		 
		 System.out.println("Cost per box:   "+CostperBox);
		 
		 System.out.println("Total cost of apples:  "+CostOfApples);
		 
		 System.out.println("Amount saved:      "+savings);
		 
		
		}//end main

}//end boxed apples