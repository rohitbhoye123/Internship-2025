package Demo1;

public class Splitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str="Hello? How are you? Good!";
	    String[]result=str.split("\\?\\s?");
	    for(String part : result) {
	    	System.out.println(part);
	    }

	}
}	
