package assignmentNo2;

import java.util.Arrays;

public class Find2ndminvalu {
	public static void main(String[] args) {
		int a[]= {-20,0,-25,15,19,37,23};
		 for(int i=0;i<a.length;i++)
		 {
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		 }System.out.println("array:"+Arrays.toString(a));
		 System.out.println("2nd min no:"+a[1]);
	}

}
