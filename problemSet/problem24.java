import acm.program.ConsoleProgram;

public class problem24 extends ConsoleProgram{
	public void run(){
		int n = readInt( "Enter number n:");
		int x= 0;
		for (int  i = 1;i <= n;i++){
			if (n % i == 0){
				x++;
			}
		}
		print("The number of divisors: " + x);
		
			}

}
