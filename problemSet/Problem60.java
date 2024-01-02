import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter m : ");
		int n = readInt("Enter n : ");
		int[] nums = new int [n];
		for(int i =0;i < n ;i++){
			nums[i] = readInt("/" );
			
		}
		for(int i =0; i < nums.length ; i++){
			for (int j = i +1; j < nums.length -1; j++){
				if(m - nums[i] == nums[j]){
					println(nums[i] + "," + nums[j]);
				}
			}
		}
		
	}
}
