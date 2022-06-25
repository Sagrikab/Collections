import java.util.*;
public class ArrayList_Collection {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Sunita");
		ar.add("Shweta");
		Iterator<String> itr=ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
