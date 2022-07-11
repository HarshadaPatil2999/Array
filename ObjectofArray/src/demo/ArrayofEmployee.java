package demo;
import java.util.Scanner;
public class ArrayofEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int id,salary;
		String name,dept,location;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Employee a[]=new Employee[size];
		
		for(int i=0;i<size;i++)
		{System.out.println("Enter"+(i+1)+"Employee details");
			System.out.print("enter id:");
			id=sc.nextInt();
			System.out.print("enter name:");
			name=sc.next();
			System.out.print("enter dept:");
			dept=sc.next();
			System.out.print("enter location:");
			location=sc.next();
			System.out.print("enter salary:");
			salary=sc.nextInt();
			
			Employee e=new Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setLocation(location);
			e.setSalary(salary);
			a[i]=e;
			
		}
		for(Employee s:a)
		{ 
			if(s.getDept().equals("HR") && s.getSalary()>30000)
			System.out.println(s);
		}

}
}