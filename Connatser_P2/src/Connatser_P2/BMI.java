package Connatser_P2;

import java.util.Scanner;
public class BMI {

	public static void main(String[] args) 
	{
		// Create a scanner for user's choice of System; Imperial or Metric
		Scanner SystemChoice = new Scanner(System.in);
		System.out.println("What system will you use? 1 for Metric, 2 for Imperial");
		int Choice = SystemChoice.nextInt();

		if (Choice == 1)
		{
			System.out.println("Enter your weight (in Kilograms)");
	        Scanner Weight_KG = new Scanner(System.in);

	        int InputWeight = Weight_KG.nextInt();
	        System.out.println("Enter your height in Meters");
	        Scanner Height_Meters = new Scanner(System.in);
	        int Height = Height_Meters.nextInt();
	        double BMI = ((double)InputWeight / ((double)Height * (double)Height));
	        System.out.println("Your BMI is " + BMI);
	        Height_Meters.close();
	        Weight_KG.close();
	    }
		
		else if(Choice == 2)
		{
			System.out.println("Enter your Weight (in Pounds)");
			Scanner weight = new Scanner(System.in);
            int Weight_LBS = weight.nextInt();
            System.out.println("%ln Enter your height in Inches");
            Scanner Height_Inches = new Scanner(System.in);
            int Height = Height_Inches.nextInt();
            double BMI = (703 * (double)Weight_LBS) / ((double)Height * (double)Height);
            System.out.println("Your BMI is " + BMI);
            Height_Inches.close();
            weight.close();
		}
        System.out.println("BMI Categories: ");
        System.out.println("Underweight is less than 18.5");
        System.out.println("Normal Weight is 18.5 - 24.9");
        System.out.println("Overweight is 25 - 29.9");
        System.out.println("Obesity is a BMI of 30 or greater");

		SystemChoice.close();
	}
}
