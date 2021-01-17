package week9;
import java.util.*;
public class ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vk=new Scanner(System.in);
int x=vk.nextInt(),i,j,k,l;
for(i=0;i<(x/2+1);i++)
{
	for(j=(x/2)-i;j>0;j--)
		System.out.print(" ");
	for(l=i+1;l>1;l--)
		System.out.print(l);
	for(k=1;k<=i+1;k++)
		System.out.print(k);
	System.out.println();
}
for(i=0;i<x/2;i++)
{
	for(j=(x/2)-(i+1);j<x/2;j++)
		System.out.print(" ");
	for(l=x/2-i;l>1;l--)
		System.out.print(l);
	for(k=1;k<=(x/2-i);k++)
		System.out.print(k);
	System.out.println();
}
	}

}
