import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram {
	int x;

	public void run() {

		int n = readInt();
		int m = readInt();
		int[] myInt = new int[n];

		for (int i = 0; i < n; i++) {
			x = readInt();
			myInt[i] = x;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (myInt[i] + myInt[j] == m) {
					ArrayList<Integer> ints = new ArrayList<>();
					ints.add(Integer.valueOf(myInt[i]));
					ints.add(Integer.valueOf(myInt[j]));
					println(ints);
				}

			}

		}

	}

}
