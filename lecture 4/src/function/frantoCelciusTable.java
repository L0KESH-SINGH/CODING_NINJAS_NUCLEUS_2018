package function;

public class frantoCelciusTable {

	public static void printFahrenheitTable(int start, int end, int step)
	{
		for(int i = start ; i<= end ; i = i+20)
		{
			int cel = (int)((5.0/9)*(i-32));
			System.out.println( i + " " + cel);
		}
	}
	
	public static void main(String[] args) {
		
		printFahrenheitTable(0,100,20);
		
	}
	
}
