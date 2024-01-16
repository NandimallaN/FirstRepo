
public class Sample {
	
	private int no;
	
	//Type1  member as a class
	private class InnerClass
	{
		private int x;
		void show() {}
		public InnerClass() {
			// TODO Auto-generated constructor stub
		}
	}
	
	
	public void display()
	{
		//Type2 Local Inner Class
		class InnerClass1
		{
			private int x;
			void show() {}
			public InnerClass1() {
				// TODO Auto-generated constructor stub
			}
		}
		
	}
	
	
	//Type3  member as a static class
		static class InnerClass2
		{
			private int x;
			void show() {}
			public InnerClass2() {
				// TODO Auto-generated constructor stub
			}
		}
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type4 	anonymouse class *** Finctional Interfaces****
		
				Sample s=new Sample() {
					void view() {
						System.out.println(" abc");
					}
				};

	}

}
