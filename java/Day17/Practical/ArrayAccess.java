package Demo1;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {20,40,80,120,160};
		
		try {
			System.out.println("6th element:"+numbers[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
        
			System.out.println("Error: Tried to access an element outside array bounds.");
	}

  }
}