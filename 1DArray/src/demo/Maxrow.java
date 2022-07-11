package demo;

public class Maxrow {
	public static void main(String[] args) {
		int arr[][] = {{22,31,9},{12,25,16}};
		
		for(int i=0;i<arr.length;i++)
		{  // int max=Integer.MIN_VALUE;
			int max=arr[0][0];
			for(int j=0;j<arr.length;j++)//22 31 9
				                           //12 25 16
			   {                            
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
				
			}
			System.out.print(max+" ");
		}
	}

}
