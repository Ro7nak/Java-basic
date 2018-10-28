package threads;

public class Demo {

	public static void main(String[] args) {
		Threads t1= new Threads();
		Threads t2= new Threads();
		Threads t3= new Threads();
		Threads t4= new Threads();
		Threads t5= new Threads();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		Thread thread4 = new Thread(t4);
		Thread thread5 = new Thread(t5);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		
	}

}
