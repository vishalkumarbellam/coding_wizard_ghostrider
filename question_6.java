package coding_wizard;
import java.util.*;
public class question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1,n=3,y;
		while(x!=10001)
		{
			y=0;
			if(n%2!=0)
			{
				for(int i=2;i<=n/2;i++)
				{
					if(n%i==0)
					{
						y=1;
						break;
					}
				}
				if(y==0)
					x++;
			}
			n++;
		}
		System.out.println(--n);
	}

}
