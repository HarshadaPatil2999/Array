package arrayObject;

public class Student {
	int rollno,age,marks;
	String name;
	Student(int rollno,String name,int age,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public String toString()
	{
		return rollno+" "+name+" "+age+" "+marks;
	}

}
