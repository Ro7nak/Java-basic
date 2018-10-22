package generics;

public class Generics {
	public <E> void printArray(E[] a) {
		for(E e: a)
			System.out.print(e);
		System.out.println("\n**************");
	}
	public static void main(String[] args) {
		Integer[] arrInteger = {10,20,30,40,50,60};
		Character[] arrChar = {'I','N','F','O','S','Y','S'};
		Double[] arrDouble = {100.1,200.1,300.1,400.1,500.1,600.1};
		Generics g = new Generics();
		g.printArray(arrInteger);
		g.printArray(arrChar);
		g.printArray(arrDouble);

	}

}
