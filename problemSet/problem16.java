import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram{
	public void run(){
	double a = readInt("Enter first number");
	double b = readInt("Enter second number");
	double c = readInt("Enter third number");
	
	println(1/(1/a + 1/b +1/c));

}
}