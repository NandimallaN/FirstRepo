package App1;

public class StringDemo1 {

	  
	public static void main(String[] args) {
		String str1="Hello";
		  String str2="Hello";
		  String str3=new String("Hello");
		  // String class is Immutable
		  System.out.println(str1.hashCode());
		  System.out.println(str2.hashCode());
		  System.out.println(str3.hashCode());
		  
		 // str3="HelloWorld";
		  
		  System.out.println(str3.hashCode());
		  
		if(str1==str3)
			System.out.println("String ares equal");
		else 
			System.out.println("String are not equal");
		
		if(str1.equals(str3))
			System.out.println("String ares equal");
		else 
			System.out.println("String are not equal");


	}

}
