package Demo1;

class MyRunnable implements Runnable{
	
	public void run() {
		
		for (int i =0; i<5; i++) {
			
			System.out.println("Hello from thread.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new MyRunnable());
		thread.start();
	}

}
