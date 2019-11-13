import java.util.*;
class Mango
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[7];
		a[2]=new int[11];
		for(int i=0;i<3;i++)
		{
			int j;
			if(i == 0)
			{
				for( j=0;j<3;j++)
				{
					System.out.println("enter the value of a["+i+"]["+j+"]=");
					a[i][j]=sc.nextInt();
				}
			}
			else if(i == 1)
			{
				for( j=0;j<7;j++)
				{
					System.out.prin
					a[i][j]=sc.nextInt();
				}
			}
			else 
			{
				for( j=0;j<11;j++)
				{
					a[i][j]=sc.nextInt();
					System.out.println("enter the value of" a["+i+"]["+j+"]=");
				}
			}
			
		}
		
		for(int k=0;k<3;k++)
		{
			if(k==0)
			{
				int l;
				for( l=0;l<3;l++)
				{
					System.out.printl
				}
			}
			if(k==1)
			{
				for( l=0;l<7;l++)
				{
					System.out.println("a["+k+"]["+l+"]="+a[k][l]);
				}
			}
			if(k==2)
			{
				for( l=0;l<11;l++)
				{
					System.out.println("a["+k+"]["+l+"]="+a[k][l]);
				}
			}
		}
	}
}