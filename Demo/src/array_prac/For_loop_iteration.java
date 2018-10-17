package array_prac;

public class For_loop_iteration {

	public static void main(String[] args) {
		int marks[] = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 30+i;
		}
		
		for (float i : marks) {
			System.out.println("Marks :"+i);
		}
	}

}
