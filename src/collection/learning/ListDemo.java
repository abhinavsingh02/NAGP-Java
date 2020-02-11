package collection.learning;

import java.util.ArrayList;
import java.util.Iterator;

class Student {

	int rollno;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "djnyk";

		ArrayList<String> list1 = new ArrayList<String>();// type specific
		ArrayList list2 = new ArrayList();

		// adding string type of values since we declare arraylist as string
		list1.add("abhinav");
		list1.add("anupam");
		list1.add("dj");
		list1.add("ronit");

		// adding any type of values since we declare generic arraylist
		list2.add(10);
		// list2.add("shantanu");
		list2.add(s1);

		System.out.println("list1 is:" + list1);
		System.out.println("list2 is " + list2);

		// Get the element from the list

		String name = list1.get(3);
		System.out.println(name);

		// Object o = list2.get(1);
		// System.out.println(o);

		// updating the element
		// list2.set(2, 07);
		// System.out.println(list2.get(2));

		// removing the element
		// list2.remove(2);
		// System.out.println(list2.get(2));// give you an exception now since we have
		// remove the element at index 2

		// Iterating throughthe list
		System.out.println("====Iterating through the list1=====");
		for (String str : list1) {
			System.out.println(str);
		}
		System.out.println("========");
		
		System.out.println("====Iterating through the list2=====");
		for (Object o : list2) {
			System.out.println(o);
		}
		System.out.println("========");
		
		Iterator itr = list1.iterator();
		//System.out.println(itr.next());
		
		while(itr.hasNext()) {
			String s=(String) itr.next();
			System.out.println(s);
		}
		
	}
	

}
