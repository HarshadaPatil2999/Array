package arrayObject;
import java.util.Scanner;
public class ArrayofStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno,age,marks;
		String name;
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		Student s[]=new Student[size];
		for(int i=0;i<size;i++)
		{System.out.println("Enter"+(i+1)+"Student Details");
			System.out.println("Enter rollno,name,age,marks");
		     rollno=sc.nextInt();
		     name=sc.next();
		     age=sc.nextInt();
		    marks=sc.nextInt();
		   Student obj=new Student(rollno,name,age,marks);
		   s[i]=obj;
			
		}
		
		for(Student a:s)
		{
			if(a.age< 15 && a.marks>60)
				System.out.println(a);
		}
	}

}
