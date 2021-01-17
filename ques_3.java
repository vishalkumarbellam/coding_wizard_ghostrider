package week9;
import java.util.*;
public class ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
int n=vk.nextInt(),a,b;
String rn="";
if(n==1000)
	System.out.println("M");
else
{
	while(n!=0)
	{
		if(n>=500)
		{
			if(n<900)
			{
				a=n/500;
				for(b=1;b<=a;b++)
					rn+="D";
				n%=500;
			}
			else
			{
				rn+="CM";
				n%=100;
			}
		}
		else if(n>=100)
		{
			if(n<400)
			{
				a=n/100;
				for(b=1;b<=a;b++)
					rn+="C";
				n%=100;
			}
			else
			{
				rn+="CD";
				n%=100;
			}
		}
		else if(n>=50)
		{
			if(n<90)
			{
				a=n/50;
				for(b=1;b<=a;b++)
					rn+="L";
				n%=50;
			}
			else
			{
				rn+="XC";
				n%=10;
			}
		}
		else if(n>=10)
		{
			if(n<40)
			{
				a=n/10;
				for(b=a;b<=a;b++)
					rn+="X";
				n%=10;
			}
			else
			{
				rn+="XL";
				n%=10;
			}
			continue;
		}
		else if(n>=5)
		{
			if(n<9)
			{
				a=n/5;
				for(b=a;b<=a;b++)
					rn+="V";
				n%=5;
			}
			else
			{
				rn+="IX";
				n=0;
			}
			continue;
		}
		else if(n>=1)
		{
			if(n<4)
			{
				a=n/1;
				for(b=1;b<=a;b++)
					rn+="I";
				n=0;
			}
			else
			{
				rn+="IV";
				n=0;
			}
		}
	}
}
System.out.println(rn);
	}

}
