package demo;

public class FindSumMinAndMax {
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9,10};
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
			if(min<arr[i])
			{
				min=arr[i];
			}
			if(max>arr[i])
			{
				max=arr[i];
			}
		}
		int min_sum=sum-min;
		int max_sum=sum-max;
		//System.out.println((sum-min)+" "+(sum-max));
		System.out.println(min_sum+" "+max_sum);
	}

}
