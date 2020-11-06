package coding_wizard;
import java.util.*;
public class question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long p=1,max=0,n=0,m=0;
	for(long i=100;i<=999;i++)
	for(long j=i;j<=999;j++)
	{
		p=i*j;
		m=p;
		while(m>0)
		{
			n*=10;
			n+=m%10;
			m/=10;
		}
		if(n==p&&p>max)
			max=p;
		n=0;
	}
	System.out.println(max);
	}

}
