package arrayObject;

public class Employee1 {
	int id,salary;
	String name,dept;
	Employee1()
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
		return id+" "+name+" "+dept+" "+salary;
	}


}
