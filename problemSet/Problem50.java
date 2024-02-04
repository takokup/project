import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram{
	
	public void run() {
		String text = readLine("Enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
        int cnt = 0;
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken(); 
            cnt++;
        }
        println("Number of tokens: " + cnt);
    }
	}

	