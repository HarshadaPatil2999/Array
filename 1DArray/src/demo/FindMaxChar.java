package demo;

import java.util.Arrays;

public class FindMaxChar {
	public static void main(String[] args) {
		
		char arr[]={'A','D','E','x','z','R'};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}System.out.println(Arrays.toString(arr));
		System.out.print("max value:"+arr[arr.length-1]);
	}

}
