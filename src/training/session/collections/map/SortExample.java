package training.session.collections.map;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
public static void main(String[] args) {
	ArrayList<ComparableSortExample> cmp = new ArrayList<ComparableSortExample>();
	String name;
	String phoneno;
	int empid;
	cmp.add(new ComparableSortExample("Rutuja","9026783920",343));
	cmp.add(new ComparableSortExample("Vijaya", "9820728390",290));
	cmp.add(new ComparableSortExample("Anuja", "9828902389",453));
	cmp.add(new ComparableSortExample("Amol", "9016380202",324));
    System.out.println("before sorting"+cmp);
   Collections.sort(cmp);
   System.out.println("after sorting"+cmp);

}
}
