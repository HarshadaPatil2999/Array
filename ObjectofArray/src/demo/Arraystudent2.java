package demo;
import java.util.Scanner;
public class Arraystudent2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,marks;
		String name,dept;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Student2 a[]=new Student2[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter"+(i+1)+"student details");
			System.out.println("enter id:");
			id=sc.nextInt();
			System.out.println("enter name:");
			name=sc.next();
			System.out.println("enter dept:");
			dept=sc.next();
			System.out.println("enter marks:");
			marks=sc.nextInt();
	  Student2 s=new Student2();
         s.setId(id);
         s.setName(name);
         s.setDept(dept);
         s.setMarks(marks);
          a[i]=s;
	}
         for(Student2 s:a)//each for loop
         {
        	 if(s.marks>=60)
        	 System.out.println(s);
         }
//for(int i=0;i<size;i++)
//{
//	System.out.println(a[i]+" ");
//}
}
}