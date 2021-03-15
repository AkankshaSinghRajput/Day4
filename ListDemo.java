import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		System.out.println("Before: "+list);
		list.remove(1);
		System.out.println("After: "+list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
	}

}
