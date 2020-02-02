package Connatser_P1;

import java.util.Scanner;

public class Encrypter {

	public static void main(String[] args) 
	{
		Scanner Number = new Scanner(System.in);
		System.out.println("Input the Four Digit number you wish to be encrypted");
		// Scans input from user
		int input = Number.nextInt();
		// Separating numbers by digit position
		int ones = input / 1000;
		int tens = (input % 1000) / 100;
		int hundreds = (input % 100) / 10;
		int thousands = (input % 10);
		
		ones = encryption(ones);
		tens = encryption(tens);
		hundreds = encryption(hundreds);
		thousands = encryption(thousands);
		
		swapper(ones, hundreds);
		swapper(tens, thousands);
		Number.close();
	}
	
	public static int encryption(int ModNumber)
	{
		ModNumber = (ModNumber + 7) % 10;
		return ModNumber;
	}
	
	public static void swapper(int number1, int number2)
	{
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.print(number1 + " " + number2);
	}
}
