package training.session.collections.map;
//compare by id and name
//ouput class
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IdComparator implements Comparator<ComparatorSortExample> {

	@Override
	public int compare(ComparatorSortExample o1, ComparatorSortExample o2) {
		// TODO Auto-generated method stub
		return o1.getEmpid()-o2.getEmpid();
	}

	public static void main(String[] args) {
		ArrayList<ComparatorSortExample> cmp = new ArrayList<ComparatorSortExample>();
		String name;
		String phoneno;
		int empid;
		cmp.add(new ComparatorSortExample("Rutuja","9026783920",343));
		cmp.add(new ComparatorSortExample("Vijaya", "9820728390",290));
		cmp.add(new ComparatorSortExample("Anuja", "9828902389",453));
		cmp.add(new ComparatorSortExample("Amol", "9016380202",324));
	    System.out.println("before sorting"+cmp);
	   Collections.sort(cmp,new IdComparator());
	   System.out.println("after sorting"+cmp);
	   
	   ArrayList<ComparatorSortExample> cmp1 = new ArrayList<ComparatorSortExample>();
	   
	   cmp1.add(new ComparatorSortExample("Rutuja","9026783920",343));
		cmp1.add(new ComparatorSortExample("Vijaya", "9820728390",290));
		cmp1.add(new ComparatorSortExample("Anuja", "9828902389",453));
		cmp1.add(new ComparatorSortExample("Amol", "9016380202",324));
	    System.out.println("before sorting"+cmp1);
	   
	   Collections.sort(cmp1,new NameComparator());
	   System.out.println("after sorting by name"+cmp1);

	}

}
