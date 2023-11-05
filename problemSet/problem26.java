import acm.program.ConsoleProgram;

public class problem26 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n:");
		int x = readInt("Enter x:");
		int lcm = lcm(n, x);
		println("The LCM is:" + lcm);

	}

	private int lcm(int n, int x) {
		return n * x / gcd(n, x);

	}

	private int gcd(int n, int x) {
		for (int i = Math.min(x, n); i >= 1; i--) {
			if (n % i == 0 && x % i == 0) {
				return i;
			}

		}
		return 0;
	}
}
