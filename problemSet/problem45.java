import acm.program.ConsoleProgram;

public class problem45 extends ConsoleProgram{
	public void run(){
		String text = readLine("text:");
		char symbol = readLine("symbol:").charAt(0);
		println("Count: " + count(text, symbol));
				
	}

	private int count(String text, char symbol) {
		int countSymbol =0;
		for( int i = 0; i < text.length(); i++){
			if (text.charAt(i) == symbol){
				countSymbol++;
			}
			
		}
		return countSymbol;
	}
	
}
