package demo;

import java.util.Scanner;

public class Student {
	
	int id,salary;
	String name;
	Course c;
	public int getId() {
		return id;
	}

public void setId(int id) {
		this.id = id;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Course getC() {
		return c;
	}



	public void setC(Course c) {
		this.c = c;
	}
public String toString()
{
	return id+" "+name+" "+salary+" "+c;
}


	public static void main(String[] args) throws NegativeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter course id ,name");
		
		int id=sc.nextInt();
		try {
		if(id<0)
		{
			throw new NegativeException("id should not be negative");
		}
		}
		catch(NegativeException n)
		{
			n.printStackTrace();
		}
		
		String name=sc.next();
		Course c1=new Course();
		c1.setId(id);
		c1.setName(name);
		
		System.out.println("enter id,name,salary");
		id=sc.nextInt();
		 name=sc.next();
		int salary=sc.nextInt();
		Student s=new Student();
		s.setId(id);s.setName(name);
		s.setSalary(salary);
		s.setC(c1);
		System.out.println(s);
		System.out.println(s.getC().getName());
		
		
	}

}
class Course{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	
	
}