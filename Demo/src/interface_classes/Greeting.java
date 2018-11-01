package interface_classes;

public interface Greeting {

	default void hello() {
		System.out.println("Hello from A");
	}
}
