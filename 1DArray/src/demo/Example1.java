package demo;

public class Example1 {
	public static void main(String[] args) {
		int arr[]= {2,5,8,3,9,1};
		//2+8=10;5+3=8;8+9=17;3+1=4;
		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		System.out.println(sum);
//		int avg=sum/arr.length;
//		
//		System.out.println(avg);
		
		for(int i=0;i<arr.length-2;i++)
		{
			sum=arr[i]+arr[i+2];
			System.out.println(sum);
		}
	}

}
