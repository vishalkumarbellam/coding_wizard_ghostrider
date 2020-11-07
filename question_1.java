package coding_wizard; 
import java.util.*;
public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
String s=vk.nextLine(),ns="";
int i=0;
while(i<s.length())
{
	if(s.charAt(i)=='G')
		ns+='C';
	else if(s.charAt(i)=='C')
		ns+='G';
	else if(s.charAt(i)=='T')
		ns+='A';
	else if(s.charAt(i)=='A')
		ns+='U';
	else
	{
		System.out.println("Invalid Input");
		System.exit(0);
	}
	i++;
}
System.out.println(ns);
	}

}
 
