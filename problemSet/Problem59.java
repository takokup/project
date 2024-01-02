import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram{
	public void run(){
		
	}
	
	private boolean submatrix (int[][]matrix){

		int maxArea = 0 ;
		for ( int r1 = 0 ; r1 < matrix.length;r1++){
			for ( int r2 = r1 ; r2 < matrix.length;r2++){
				for ( int c1 = 0 ; c1 < matrix[0].length;c1++){
					for ( int c2 = c1 ; c2 < matrix[0].length;c2++){
						if(isFilled(matrix,r1,r2,c1,c2)){
							
						}
					}
				}
			}
		}
	}
	
	private boolean isFilled(int[][]matrix,int r1,int c1,int r2,int c2){
		for(int r = r1;r<=r2;r++){
			for(int c = c1; c <= c2 ; c++){
				if(matrix[r][c] == 0){
					return false;
				}
			}
		}
		return true;
	}

}
