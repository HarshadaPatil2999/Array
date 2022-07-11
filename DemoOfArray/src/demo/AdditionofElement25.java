package demo;

public class AdditionofElement25 {
	public static void main(String[] args) {
		
	
	int arr[]= {11,15,1,4,10,6,17,3,24};
	int num=25;
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
		temp=arr[i]+arr[j];
		if(num==temp)
		{
			System.out.print(arr[i]+" "+arr[j]+" ");
		}
			
		}
		
	}


}
}