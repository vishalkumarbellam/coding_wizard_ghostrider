package coding_wizard;
import java.util.*;
public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk= new Scanner(System.in);
char comp[]= {'R','P','S'},u;
int r,i=0,x1=0,x2=0;
while(i<3)
{
	u=vk.next().charAt(0);
	r=(int)(Math.random()*3);
	if(u=='R'||u=='r')
	{
		if(comp[r]=='S')
			{
				x1++;
				System.out.println("Computer:"+comp[r]);
				System.out.println("User:"+u);
				System.out.println("User wins this round");
			}
		else if(comp[r]=='P')
			{
				x2++;
				System.out.println("Computer:"+comp[r]);
				System.out.println("User:"+u);
				System.out.println("Computer wins this round");
			}
		else 
		{
			System.out.println("Computer:"+comp[r]);
			System.out.println("User:"+u);
			System.out.println("Tie");
		}
	}
	else if(u=='P'||u=='p')
	{
		if(comp[r]=='R')
			{
				x1++;
				System.out.println("Computer:"+comp[r]);
				System.out.println("User:"+u);
				System.out.println("User wins this round");
			}
		else if(comp[r]=='S')
			{
				x2++;
				System.out.println("Computer:"+comp[r]);
				System.out.println("User:"+u);
				System.out.println("Computer wins this round");
			}
		else 
		{
			System.out.println("Computer:"+comp[r]);
			System.out.println("User:"+u);
			System.out.println("Tie");
		}
	}
	else if(u=='S'||u=='s')
	{
		if(comp[r]=='P')
			{
				x1++;
				System.out.println("Computer:"+comp[r]);
				System.out.println("User:"+u);
				System.out.println("User wins this round");
			}
		else if(comp[r]=='R')
			{
				x2++;
				System.out.println("Computer:"+comp[r]);
				System.out.println("User:"+u);
				System.out.println("Computer wins this round");
			}
		else 
		{
			System.out.println("Computer:"+comp[r]);
			System.out.println("User:"+u);
			System.out.println("Tie");
		}
	}
	else
		System.out.println("Wrong Input");
	i++;
}
if(x1>x2)
	System.out.println("You win by:"+x1+"-"+x2);
else if(x2>x1)
	System.out.println("Computer wins:"+x1+"-"+x2); 
	}

}
