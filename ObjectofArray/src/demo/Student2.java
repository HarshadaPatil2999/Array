package demo;

public class Student2 {
	int id,marks;
	String name,dept;
	Student2()
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
	int getMarks()
	{
		return marks;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
}
