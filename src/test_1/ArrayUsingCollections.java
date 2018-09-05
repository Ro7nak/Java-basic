package test_1;

public class ArrayUsingCollections {

	public static <E> void printArray(E[] inputArray) {
		for(E element : inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5,6,7};
		Double[] doubleArray	= {1.1,2.2,3.3,4.4,5.5,6.6};
		Character[] charArray	= {'A','B','C','D','E'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	
		
	}
	
}
