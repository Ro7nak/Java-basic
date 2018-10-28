package threads;

class CancelRegistration extends Thread {
	Course c;

	CancelRegistration(Course c) {
		this.c = c;
	}
	public void run() {
		c.cancelSeats();
	}
	
	 public static void main(String args[]) throws InterruptedException {
	        Course cse = new Course("CSE", 1);
	        RegisterThread regObj1 = new RegisterThread(cse);
	        regObj1.start();
	        RegisterThread regObj2 = new RegisterThread(cse);
	        regObj2.start();

	        Thread.sleep(2000);
	        // Running a cancellation thread after 2 seconds
	        CancelRegistration cancelObj1 = new CancelRegistration(cse);
	        cancelObj1.start();
	    }
}
