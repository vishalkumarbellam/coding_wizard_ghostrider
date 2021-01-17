package week9;
import java.util.*;
public class ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
int n=vk.nextInt(),i,j,k,x,a,b,c;
if(n>3)
{
	int arr[]=new int[n];
	for(i=0;i<n;i++)
		arr[i]=vk.nextInt();
	Arrays.sort(arr);
	System.out.println("Enter sum");
	x=vk.nextInt();
	for(i=0;i<n;i++)
	{
		if(arr[i]>=x-1)
			continue;
		a=arr[i];
		for(j=i+1;j<n;j++)
		{
			if(arr[j]+a>=x)
					continue;
				b=arr[j];
				for(k=j+1;k<n;k++)
				{
					if(a+b+arr[k]==x)
						System.out.println(a+" "+b+" "+arr[k]);
				}
		}
	}
}
else
{
	System.out.println("Insufficient data");
}
	}

}
