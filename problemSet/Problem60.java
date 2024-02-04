import java.util.ArrayList;
import java.util.Collections;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	int n;
	public void run(){
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		while(true){
			if(n == -1){
				break;
			}
			n = readInt();
			arr.add(Integer.valueOf(n));
		}
		
		if(arr.size() != 1){
			for(int i = 2 ; i <= arr.size();i++){
			result.add(arr.get(arr.size()-i));
		}
		}
		
		println(result);
	}

}
