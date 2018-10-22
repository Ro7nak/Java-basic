package stringBuffer;

public class String_Buffer {

	public static void main(String[] args) {
		String firstName= "Sachin";
		StringBuffer sb = new StringBuffer(firstName);
		String name = sb.append(" Tendulkar").toString();
		System.out.println(name);

	}

}
