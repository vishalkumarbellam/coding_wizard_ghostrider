package week9;
import java.util.*;
public class ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
String S1=vk.nextLine();
String x=S1.toLowerCase();
StringBuffer s1=new StringBuffer(x);
String S2=vk.nextLine();
String y=S2.toLowerCase();
StringBuffer s2=new StringBuffer(y);
StringBuffer s3=new StringBuffer();
int i,j;
char ch1,ch2;
for(i=0;i<s2.length();i++)
{
	ch1=s2.charAt(i);
	for(j=0;j<s1.length();j++)
	{
		ch2=s1.charAt(j);
		if(ch1!=ch2)
			s3.append(ch2);
	}
	s1=null;
	s1=new StringBuffer();
	s1.append(s3);
	s3=null;
	s3=new StringBuffer();
}
System.out.println(s1);
	}

}
