package assignmentno1;

public class BirthdayCakeCandle {
	public static void main(String[] args) {
		int a[]= {2,4,4,3,1};
		int max=a[0];
		
		int cnt=1;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				cnt++;
			}
			
		}
		
	     System.out.println(cnt+" "+max);
		
		
		
	}

}
