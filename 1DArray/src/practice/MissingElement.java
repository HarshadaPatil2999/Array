package practice;

public class MissingElement {
	public static void main(String[] args)
	{
		
	System.out.println("missing elements in array are:");
	int a[]= {1,2,3,5,7,9,15};
	int cnt=1;
	int i=0;
	while(i<a.length)
//	for(int i=0;i<a.length;)
	{
	if(a[i]==cnt)
		
	{  i++;
		cnt++;
	}
	else
	   {
	  System.out.print(cnt+" ");
	   cnt++;
	   }
	}

}
}
