package App1;

class Sample01 extends Object
{
	public Sample01() {
		super();
		System.out.println("Default Constructor.....Sample01");
	}
	
	Sample01(int x)
	{
		this(); // it is used to call same class default constructor
		System.out.println(" Argument Constructor from Sample01"+x);
	}
}

public class Sample  extends Sample01{
	
	Sample()
	{
		super();// super class default constructor
		System.out.println("Default Constructor.....Sample ");
	}
	
	Sample(int x)
	{
		super(200);// super with argument call the super class arguemnt constructor 
		// if the is no argment super method, by default super() is available
		System.out.println(" Argument Constructor from Sample"+x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sample s=new Sample();
		
		//System.out.println(Integer.toHexString(s.hashCode()));
		//System.out.println(s);
		
		Sample s1=new Sample(100);

	}

}
