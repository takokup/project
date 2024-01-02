import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRoulette();

		if (betNumber == rouletteNumber) {
			println("you won!");
		} else {
			println("you lost!");
		}

	}

	private int spinRoulette() {
		int rouletteResult = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("Roulette result is:" + rouletteResult);
		return rouletteResult;
	}

	private int readBet() {
		while (true) {
			int bet = readInt("Enter bet number(0 - 36:");
			if (bet < 0 || bet > 36) {
				println("Enter bet number(0 - 36:");
			} else {
				return bet;
			}
		}

	}

}
