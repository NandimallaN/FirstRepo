package App1;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str3=new StringBuffer("Hello");
		// String Buffer is Mutable
		
		System.out.println(str3);
		System.out.println(str3.hashCode());
		str3.append("World");
		System.out.println("================");
		System.out.println(str3);
		System.out.println(str3.hashCode());
		

	}

}
