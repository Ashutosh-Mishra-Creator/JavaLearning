package com.javacode.qspider_assignment.day11_Scanner;

import java.util.Scanner;

class CharacterVowelConsonant {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = scanner.next().toLowerCase();
		char c = name.charAt(0);
		System.out.println("Hi your name is " + name + " and yours name first character is " + c);
		if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			System.out.println("Character " + c + " is a vowel.");
		}else{
			System.out.println("Character " + c + " is a consonant.");
		}
	}
}
			