package training.session6.oopconcepts;
//task 30
public class Person {
	String first_name;
	String last_name;
	int age;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isTeen(int age)
	{
		if(age>12 && age<=20)
		{
			return true;
		}
		return false;
		
	}
	public String getFullName()
	{
		
		if(first_name.isEmpty())
		{
			return last_name;
		}
		else if(last_name.isEmpty())
		{
			return first_name;
		}
		else if(first_name.isEmpty() && last_name.isEmpty())
		{
			return "name is empty";
		}
		else
		{
			first_name += last_name;
			System.out.println("name is :"+first_name);
			return first_name;
			
		}
	}
	
public static void main(String[] args) {
	Person p = new Person();
	//p.setAge(15);
	p.setFirst_name("rutuja");
    p.setLast_name("");
	System.out.println("full name is : " +p.getFullName());
	p.setFirst_name("");
    p.setLast_name("tribhuvan");
    System.out.println("full name is : " +p.getFullName());
    p.setFirst_name("");
    p.setLast_name(" ");
    System.out.println("full name is : " +p.getFullName());
    p.setFirst_name("rutuja");
    p.setLast_name("tribhuvan");
    System.out.println("full name is : " +p.getFullName());
	
	System.out.println("age is: "+p.isTeen(16));
	//System.out.println("full name is : " +p.getFullName());
	
}
}
