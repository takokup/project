import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run() {
		String txt = "209367";
		StringToInteger(txt);
	}

	private int StringToInteger(String txt) {
		int res = 0;
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == '0') {
				res = (int) (res + 0 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '1') {
				res = (int) (res + 1 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '2') {
				res = (int) (res + 2 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '3') {
				res = (int) (res + 3 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '4') {
				res = (int) (res + 4 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '5') {
				res = (int) (res + 5 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '6') {
				res = (int) (res + 6 * Math.pow(10, txt.length() - i-1));
			} else if (txt.charAt(i) == '7') {
				res = (int) (res + 7 * Math.pow(10, txt.length() - i-1));
			}else if(txt.charAt(i)=='8'){
				res= (int) (res+ 8*Math.pow(10,txt.length()-i-1));
			}else if(txt.charAt(i)=='9'){
				res= (int) (res+ 9*Math.pow(10,txt.length()-i-1));
			}
		}
		println(res);
		return res;

	}

}
