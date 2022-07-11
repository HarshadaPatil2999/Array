package demo;
import java.util.Scanner;
public class Arraystudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,marks;
		String name,dept;
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Student a[]=new Student[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter id:");
			id=sc.nextInt();
			System.out.println("enter name:");
			name=sc.next();
			System.out.println("enter dept:");
			dept=sc.next();
			System.out.println("enter marks:");
			marks=sc.nextInt();
			a[i]=new Student(id,name,dept,marks);
		}
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(a[i]+" ");
//		}
		for(Student s : a)
		{
//			if(s.marks>80 && s.name.startsWith("r"))
			System.out.println(s);
		}
	}

}
