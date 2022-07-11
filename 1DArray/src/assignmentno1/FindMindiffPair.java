package assignmentno1;

public class FindMindiffPair {
	public static void main(String[] args) {
		
		int a[]= {2,5,2,7,6,2,6,8,3,8};
		int min=Integer.MAX_VALUE;
		System.out.println(min);
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i+=2)
		{
			int diff=a[i]-a[i+1];
			
				if( diff<0 )
				{
					diff=-(diff);
				}
				if(min>diff)
				 {
					min=diff;
					b=a[i];
					c=a[i+1];
				 }
			
		}
		System.out.println("Min diff Pair:"+b+" "+c);
		System.out.println("min Diff:"+min);
	}

}
