package List;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
	TreeSet numberSet=new TreeSet();
	
	numberSet.add(35);
	numberSet.add(45);
	numberSet.add(67);
	numberSet.add(11);
	numberSet.add(90);
	
	Iterator numIter=numberSet.iterator();
	
	while(numIter.hasNext()) {
		int intValue=(Integer) numIter.next();
		System.out.println("num:"+intValue);
		
	}
	}
}
