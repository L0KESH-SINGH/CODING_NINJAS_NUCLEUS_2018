package Strings;

public class sumoffirst100primenums {
	
	public static int sumof100primes(int count, int i, int sum) {
		if (count == 100) {
			return 0;
		}
		int smallans = 0;

		int d = 2;
		int flag = 1;
		while (d < i) {
			if (i % d == 0) {
				flag = 0;
				break;
			}
			d++;
		}
		if (flag == 1) {
			count++;
			smallans = i;
		}
		return smallans + sumof100primes(count, i + 1, sum);

	}

	public static void main(String[] args) {
		
		System.out.println(sumof100primes(0, 2, 0));

	}

}
