package Day_9;

import java.util.LinkedList;

public class Linked_types {

	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(78);
		System.out.println(l1);
		l1.addFirst(25);
		l1.add(3,30);
		l1.addLast(56);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(45);
		l1.remove(1);
		
		
		// TODO Auto-generated method stub

	}

}
