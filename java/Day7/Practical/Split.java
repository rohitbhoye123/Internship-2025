package Demo1;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		
		String sentence=s.nextLine();
		
		String[] words=sentence.split("");
		
		System.out.println("words in the sentence");
	
        for(String word:words)
        {
        	System.out.println(word);
        }
    
	}  
}
