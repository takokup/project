import acm.program.ConsoleProgram;

public class problem25 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter n:");
		int x = readInt ("Enter x:");
		int gcd = gcd (n,x);
		println("The GCD is :" + gcd);
		
	}

	private int gcd(int n, int x) {
		for(int i = Math.min(x, n); i >= 1; i--){
			if(n % i ==0 && x % i == 0){
				return i;
			}
		}
		return 0;
	}

}
