package interface_classes;

public interface GreetingExtn extends Greeting{

	default void hello() {
		System.out.println("Hello from B");
	}
}
