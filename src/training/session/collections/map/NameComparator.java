package training.session.collections.map;
//compare by name
import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorSortExample> {

	
	@Override
	public int compare(ComparatorSortExample v1, ComparatorSortExample v2) {
		// TODO Auto-generated method stub
		return v1.getName().compareTo(v2.getName());
	}

}
