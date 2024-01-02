

import java.util.StringTokenizer;

import acm.program.*;

public class problem50 extends ConsoleProgram{
	public void run(){
		String text = readLine ("Enter text ;");
		StringTokenizer tokenizer = new StringTokenizer(text,"	,.!?");
		int count = 0;
		
		while(tokenizer.hasMoreTokens())
		{
			String currToken = tokenizer.nextToken();
			count++;
		}
		println("Count ;" + count);
		}

}

//
////mari
//String substr = text.substrung(2); // ri
//String halDelI = text.substring(0, 2) + delIsInStr(text.substring(2));
//
//text = "mari";
//int index = text.indexOf("ari");
//String mariWothoutAri = "mari".substring(0,index);