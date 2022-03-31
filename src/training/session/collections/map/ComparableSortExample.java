package training.session.collections.map;

public class ComparableSortExample implements Comparable<ComparableSortExample> {

	private String name;
	private String phoneno;
    private int empid;
    
    
    @Override
	public int compareTo(ComparableSortExample c) {
		
		return this.empid-c.empid;
		}
	
	public ComparableSortExample(String name, String phoneno, int empid) {
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
	return "ComparableSortExample [name=" + name + ", phoneno=" + phoneno + ", empid=" + empid + "]";
}
	
	}

