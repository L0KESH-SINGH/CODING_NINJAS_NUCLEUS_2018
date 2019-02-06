package assingmentArray;

import java.util.*;

public class rajat2 {

	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
int N;
N = s.nextInt();


int a[]=new int[N];
for(int i=0;i<a.length;i++)
{
	a[i]=s.nextInt();
}
int x=s.nextInt();
Arrays.sort(a);

for(int i=0;i<a.length-2;i++)
{
	for(int j=i+1;j<a.length-1;j++)
	{
		for(int k=j+1;k<a.length;k++)
		{
			if(a[i]+a[j]+a[k]==x)
			{
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
		}
	}
}




		
		
	}

}
