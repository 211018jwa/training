package com.revature.demos;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void demo() {
		// A Queue is just like in real life
		// The order that elements enter the queue is the order they come out
		// FIFO (first in, first out)
		
		Queue<String> linkedListQueue = new LinkedList<>();
		
		linkedListQueue.add("1st Person");
		linkedListQueue.add("2nd Person");
		linkedListQueue.add("3rd Person");
		
		// We could use poll or remove to retrieve elements from the queue
		// poll returns null if the queue is empty
		// remove will throw an exception if the queue is empty
		String element = linkedListQueue.poll();
		System.out.println(element); // 1st Person
		
		System.out.println(linkedListQueue.poll()); // 2nd Person
		System.out.println(linkedListQueue.poll()); // 3rd Person
		System.out.println(linkedListQueue.poll()); // null
	}
	
}
