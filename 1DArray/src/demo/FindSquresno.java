package demo;

public class FindSquresno {
	public static void main(String[] args) {
		int a[]= {23,43,25,49,12,9,4,66,39,0};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(j*j==a[i])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
		
		
		
//		for(int i=0;i<a.length;i++)
//		{//25 49 9
//			double sr=Math.sqrt(a[i]) ;
//			if((sr-Math.floor(sr))==0)
//			{
//				System.out.print(a[i]+" ");
//			}
//			
//		}
	}

}
