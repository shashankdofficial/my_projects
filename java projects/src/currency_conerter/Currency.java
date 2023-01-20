package currency_conerter;

public class Currency {

	public static void main(String[] args) {
		int N = 1;
		
		int t,sum=0,l;
		l=N;
		
		while(N > 0) {
			t = N%10;
			sum = sum*10+t;
			N = N/10;
		}
		
		if(l == sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
