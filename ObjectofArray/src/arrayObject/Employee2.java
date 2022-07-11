package arrayObject;

public class Employee2 {
	int id;
	MyDate joiningdate;
	String name;
	Employee2()
	{ }
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
	MyDate getJoiningdate()
	{
		return joiningdate;
	}
	void setJoiningdate(MyDate Joiningdate)
	{
		this.joiningdate=joiningdate;
	}
	
	public String toString()

	{
		return id+" "+name+" "+joiningdate;
	}
}
