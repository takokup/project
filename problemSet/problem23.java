import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram{
	public void run(){
		int sum = 0;
		int n = readInt( "Enter number n:");
		for (int i = 0;i <n;i++){
			
			sum+=i;
		}
		sum+=n;
		println("Sum is ; " + sum);
	}

}
