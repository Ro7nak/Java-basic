package threads;

public class App {

	public static void main(String[] args) {
		DataContainer d = new DataContainer();
		Producer p = new Producer(d);
		p.start();
		Consumer c = new Consumer(d);
		c.start();
	}

}
