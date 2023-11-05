import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram{
	public void run(){
		int n = 0;
		int x =0;
	
		n = readInt("? ");
		if (n % 2 == 0){
			x = 1;
		}
		if (n == -1) { 			
		println("there are no numbers added .");
		}
		while (true) {
			n = readInt("? ");
			if (n % 2 ==0){
				x+= 1;
			}
			if (n == -1) {
				break;
			}
			

}
		println("The even numbers are :" + x);
		}
	}

