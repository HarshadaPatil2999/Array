package demo2;
import java.util.Arrays;
import java.util.Scanner;
public class StudentArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int id,marks;
		String name;
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
	   Student s1[]=new Student[size];
	   
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter"+(i+1)+"Student Details");
			System.out.println("Enter id,name,marks");
		     id=sc.nextInt();
		     name=sc.next();
		    marks=sc.nextInt();
		   Student s=new Student();
		   s.setId(id);
		   s.setName(name);
		   s.setMarks(marks);
		   s1[i]=s;
			
		}
		
		System.out.println("Enter the size2 of array");
		int size2=sc.nextInt();
		Student s2[]=new Student[size2];
		
		for(int i=0;i<size2;i++)
		{
			System.out.println("Enter"+(i+1)+"Student Details");
			System.out.println("Enter id,name,marks");
		     id=sc.nextInt();
		     name=sc.next();
		    marks=sc.nextInt();
		  Student stud=new Student();
		   stud.setId(id);
		   stud.setName(name);
		   stud.setMarks(marks);
		   s2[i]=stud;
			
		}
		
		int k=0;
		for(Student std:s1)
		{
			for (Student st:s2)
			{
				if(std.getId()==st.getId() && std.getName().equals(st.getName()) && std.getMarks()==st.getMarks())
						{
							k++;
						}
			}
		}
		
		Student s3[]=new Student[(size+size2)-(k*2)];
		int b=0;
		
		for(Student std:s1)
		{
			int c=0;
			for(Student st:s2)
			{
				if(std.getId()==st.getId() && std.getName().equals(st.getName()) && std.getMarks()==st.getMarks())
				{
					c++;
					
				}
			}
			if(c==0)
			{
				s3[b]=std;
				b++;
			}
		}
		for(Student std:s2)
		{
			int c=0;
			for(Student st:s1)
			{
				if(std.getId()==st.getId() && std.getName().equals(st.getName()) && std.getMarks()==st.getMarks())
				{
					c++;
					
				}
			}
			if(c==0)
			{
				s3[b]=std;
				b++;
			}
		}
		System.out.println("First Array:"+Arrays.toString(s1));
		
       System.out.println("Second Array:"+Arrays.toString(s2));
		
		System.out.println("Third Array:"+Arrays.toString(s3));
		
		

		
		
		
		
	
		
		
		
		
	}
}
			
		
		
		

	


