package coding_wizard;
import java.util.*;
public class question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
String s=vk.nextLine(),d,y,m;
d=s.substring(0,2);
y=s.substring(s.length()-4,s.length());
int dy,yr,days=0,x=0;
dy=d.charAt(0)-48;
if(d.charAt(1)!=' ')
	dy=dy*10+(d.charAt(1)-48);
if(dy>9)
	m=s.substring(6,s.length()-5);
else
	m=s.substring(5,s.length()-5);
yr=(y.charAt(0)-48)*1000;
yr+=(y.charAt(1)-48)*100;
yr+=(y.charAt(2)-48)*10;
yr+=(y.charAt(3)-48);
if((yr%4==0&&yr%100!=0)||yr%400==0)
	x=1;
if(m.compareTo("January")==0)
	days=dy;
else if(m.compareTo("February")==0)
	days=31+dy;
else if(m.compareTo("March")==0)
	days=31+28+dy+x;
else if(m.compareTo("April")==0)
	days=31+28+31+dy+x;
else if(m.compareTo("may")==0)
	days=31+28+31+30+dy+x;
else if(m.compareTo("June")==0)
	days=31+28+31+30+31+dy+x;
else if(m.compareTo("July")==0)
	days=31+28+31+30+31+30+dy+x;
else if(m.compareTo("August")==0)
	days=31+28+31+30+31+30+31+dy+x;
else if(m.compareTo("September")==0)
	days=31+28+31+30+31+30+31+31+dy+x;
else if(m.compareTo("October")==0)
	days=31+28+31+30+31+30+31+31+30+dy+x;
else if(m.compareTo("November")==0)
	days=31+28+31+30+31+30+31+31+30+31+dy+x;
else if(m.compareTo("December")==0)
	days=31+28+31+30+31+30+31+31+30+31+31+dy+x;
System.out.println(days);
	}

}
