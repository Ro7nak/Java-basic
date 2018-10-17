package array_prac;

public class Array_Test {

	public static void main(String[] args) {
		long phone[]= new long[3];
		phone[0]=033123456;
		phone[1]=033123457;
		phone[2]=033123454;
		System.out.println(phone[0]);
		int count =1;
		for (int i = 0; i < phone.length; i++) {
			System.out.println("phone number "+count+": "+phone[i]);
			count++;
		}

	}

}
