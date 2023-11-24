import acm.program.ConsoleProgram;

public class problem47 extends ConsoleProgram{
	
	private String text;


	public void run(){
		String text = readLine("enter Text : ");
		boolean isPalindrome = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            println("The text is a palindrome");
        } else {
            println("The text is not a palindrome");
        }
	}
		
		
			}


	
	
	


