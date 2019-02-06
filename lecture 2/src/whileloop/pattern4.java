package whileloop;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		//int space  =1;
		int val =1;
		while(i<=n)
		{
			int j=1;
			val=i;
			int space  =1;
			while(space<= (n-i))
			{
				System.out.print(" ");
				space++;
			}
			while (j<=i)
			{
				System.out.print(val);
				j=j+1;
				val=val+1;
				
			}
			System.out.println();
			i=i+1;
			
		}
		
	}

}
