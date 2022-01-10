package com.example.Jenkins_Docker;

public class App 
{

    	
	public static boolean cheackIfInputIsAnEvenNumber(int number)
	{
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		
		
		System.out.println(cheackIfInputIsAnEvenNumber(122));

	}
}