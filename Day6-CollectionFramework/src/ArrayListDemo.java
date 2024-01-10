import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		//HashSet<String> list=new HashSet<String>();
		list.add("Green");
		list.add("Yellow");
		list.add("White");
		list.add("Blue");
		list.add("Red");
		list.add("Purple");
		
		list.add("Green");
		list.add("Yellow");
		list.add("White");
		list.add("Blue");
		list.add("Red");
		list.add("Purple");
		
		System.out.println(list);
		System.out.println("HOw many elements are there"+list.size());
		System.out.println(list.contains("Green1"));
		System.out.println(list.get(1));
		System.out.println(list.indexOf("Red"));
		
		
		//Type1
		/*
		for (String string : list) {
			System.out.println(string);
		}
		*/
		
		//Type2
		/*
		Iterator<String> i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		//Type3
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
