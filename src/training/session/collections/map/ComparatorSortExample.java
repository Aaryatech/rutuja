package training.session.collections.map;

import java.util.Comparator;

public class ComparatorSortExample implements Comparator<ComparatorSortExample> {
	private String name;
	private String phoneno;
	private int empid;
	
	public ComparatorSortExample(String name, String phoneno, int empid) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.empid = empid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "ComparatorSortExample [name=" + name + ", phoneno=" + phoneno + ", empid=" + empid + "]";
	}

	@Override
	public int compare(ComparatorSortExample o1, ComparatorSortExample o2) {
		// TODO Auto-generated method stub
		return o1.getEmpid()-o2.getEmpid();
		}

	
	
	

}
