package collection.learning;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();

		set.add("abhinav");
		set.add("dj");
		set.add("abhinav");
		set.add("laptop");
		set.add("tv");
		set.add("apple");

		// 1.Data is unique
		// 2.Data is unordered due to hashing
		System.out.println("Set is" + set);

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}

}
