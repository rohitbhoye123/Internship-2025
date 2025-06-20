package Demo1;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		
		char ch=s.next().toLowerCase().charAt(0);
		
		switch(ch) {
		
		case 'a':
		case 'v':
		case 'g':
		case 'd':
		case 'e':
		
		System.out.println(ch+ "is a Vowel");
		break;
		default:
		if(Character.isLetter(ch)) {
			System.out.println(ch+"is a consonant");
	    }
	}

 }
	
}

