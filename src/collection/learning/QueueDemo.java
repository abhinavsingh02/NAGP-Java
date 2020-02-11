package collection.learning;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int i = 10; i > 0; i--) {
			queue.add(i);
		}

		// Queue: (front)10 9 8 7 6 5 4 3 2 1(end)
		//priority queue will sort the data 
		//queue: (front) 1 2 3 4 5 6 7 8 9 10(end)
		
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.size());
		System.out.println(queue.peek());

	}

}
