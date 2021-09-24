package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList <String> ();
		list.add("Satya");
		list.add("Sujatha");
		list.add("Murthy");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			for(String data:list) {
				System.out.println(data);
			}
			Collections.sort(list,Collections.reverseOrder());
			//Collections.reverse(list);
			System.out.println(list);
			LinkedList<String> list1 = new LinkedList<String>();
			list1.add("Satya");
			list1.add("Nani");
			list1.add("Teja");
			
			list1.addFirst("bunny");
					
			list1.addLast("Babi");
			System.out.println(list1); 
			
			Stack<String> stack = new Stack<String>();
			stack.push("name1");
			stack.push("name2");
			stack.pop();
			stack.push("name3");
			stack.push("name4");
			System.out.println(stack.peek());
			
			Vector<String> vector = new Vector<String>();
			
			vector.add("name1");
			vector.add("name2");
			
					
			
		     
		}
		
		}

}
