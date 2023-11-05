import acm.program.ConsoleProgram;

public class problem18 extends ConsoleProgram{
	public void run(){
		int a = readInt("Enter first number:");
		int b = readInt("Enter second nuber:");
		if(a > b){
			println(a);
		}
		if(a < b){
			println(b);
		}
		if(a == b){
			println(a);
		}
	}

}
