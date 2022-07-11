package arrayObject;
import java.util.Scanner;


public class ArrayofEmployee1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int id,salary;
		String name,dept;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Employee1 a[]=new Employee1[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter"+(i+1)+"Employee details");
			System.out.print("enter id:");
			id=sc.nextInt();
			System.out.print("enter name:");
			name=sc.next();
			System.out.print("enter dept:");
			dept=sc.next();
			System.out.print("enter salary:");
			salary=sc.nextInt();
			
			Employee1 e=new Employee1();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			a[i]=e;
			
		}
		for(Employee1 s:a)
		{ 
			
			System.out.println(s);
		}


}
}
