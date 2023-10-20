import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram{
	public void run(){
		int num1 = readInt("Enter first number:");
		int num2 = readInt("Enter second number:");
		double avg =(num1 + num2)/2.0;
		println(avg);
	}

}
