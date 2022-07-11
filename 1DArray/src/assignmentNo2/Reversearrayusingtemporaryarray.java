package assignmentNo2;
import java.util.Arrays;
public class Reversearrayusingtemporaryarray {
	public static void main(String[] args) {
		
		int a[]= {3,90,45,29,37,78};
	
	for(int i=0;i<a.length/2;i++)
	{
		     int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		
		}System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
