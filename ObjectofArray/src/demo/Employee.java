package demo;

public class Employee {
	int id,salary;
	String name,dept,location;
	Employee()
	{}
	int getId()
	{
		return id;
	}
	void setId(int id)
	{
		this.id=id;
	}
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getDept()
	{
		return dept;
	}
	void setDept(String dept)
	{
		this.dept=dept;
	}String getLocation()
	{
		return location;
	}
	void setLocation(String location)
	{
		this.location=location;
	}
	int getSalary()
	{
		return salary;
	}
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+location+" "+salary;
	}
}
