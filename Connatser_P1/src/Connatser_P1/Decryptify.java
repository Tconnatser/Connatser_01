package Connatser_P1;

import java.util.Scanner;
public class Decryptify {

	public static void main(String[] args) 
	{
		Scanner Number = new Scanner(System.in);
		System.out.printf("Input the number to be Decrypted: ");
		int input = Number.nextInt();
		
		int ones = input / 1000;
		int tens = (input % 1000) / 100;
		int hundreds = (input %100) / 10;
		int thousands = (input % 10);
		
		ones = decryptify(ones);
		tens = decryptify(tens);
		hundreds = decryptify(hundreds);
		thousands = decryptify(thousands);
		
		position(ones, tens, hundreds, thousands);
		Number.close();
	}
	
	public static int decryptify(int value)
	{
		value = (value + 3) % 10;
		return value;
	}
	
	public static void position(int first, int second, int third, int fourth)
	{
		int temp1 = first;
		int temp2 = third;
		first = second;
		second = fourth;
		third = temp1;
		fourth = temp2;
		
		System.out.println(first + "" + second + "" + third + "" + fourth);
	}

}
