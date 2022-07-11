package demo;

public class Employee2 {
	int id,salary;
	String name,dept,location;
	Employee2(int id,String name,String dept,String location,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.location=location;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+location+" "+salary;
	}

}
