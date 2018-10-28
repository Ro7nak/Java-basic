package threads;

public class Consumer extends Thread{
	DataContainer d;
	
	Consumer(DataContainer d){
		this.d = d;
	}
	
	public void run() {
		 System.out.println(d.get());
	}
}
