import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem36 extends ConsoleProgram{
	private static final int NUM_EXPERIMENTS = 1000000000;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		double sumFlips = 0;
		for (int i = 0; i < NUM_EXPERIMENTS; i++){
			int currentFlips = holdExperiment();
			sumFlips += currentFlips;
		}
		double avgFlips = sumFlips / NUM_EXPERIMENTS;
		println(avgFlips);
		
	}private int holdExperiment() {
		int numFlips = 0;
		int numConsecutiveHeads = 0;
		while (true){
			numFlips += 1;
			boolean isHeads = rgen.nextBoolean(0.4);
			if(isHeads){
				numConsecutiveHeads += 1;
				if(numConsecutiveHeads == 3){
					break;
					
				}
			}else{
				numConsecutiveHeads = 0;
			}
		}
		return numFlips;
	}
	

}


