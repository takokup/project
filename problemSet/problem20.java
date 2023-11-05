import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n:");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int x = readInt("enter x:");
			sum += x;
		}

		println("The sum is " + sum);

	}

}
