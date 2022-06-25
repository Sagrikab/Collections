import java.util.*;

public class PriorityQueue_Collection {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Sunita Bhandare");
		queue.add("Shweta Bhandare");
		queue.add("Mimmi");
		queue.add("Sagarika");
		queue.add("V");
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//queue.retainAll(queue);
		//queue.poll();
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
