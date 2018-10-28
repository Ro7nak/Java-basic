package threads;

public class Producer extends Thread{
 DataContainer d;
 
	Producer(DataContainer d){
		this.d = d;
	}
 public void run(){
	 d.put(100);
 }
 
}
