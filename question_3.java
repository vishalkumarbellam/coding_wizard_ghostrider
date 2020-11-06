package coding_wizard;
import java.util.*;
public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
long n,c=0,max=0,x=0;
for(long i=2;i<=1000000;i++)
{
	n=i;
	c=1;
	while(n!=1)
	{
		if(n%2==0)
			n/=2;
		else
			n=(3*n)+1;
		c++;
	}
	if(c>max)
	{
		max=c;
		x=i;
	}
}
System.out.println(x);
	}

}
