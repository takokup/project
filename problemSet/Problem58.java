import acm.program.ConsoleProgram;


public class Problem58 extends ConsoleProgram {
	public void run() {
		int[][] matrix = {
	            {2, 1, 4},
	            {7, 5, 3},
	            {6, 1, 8}
	        };
		 if (magicMatrix(matrix)) {
	            println("The matrix is a magic square.");
	        } else {
	            println("The matrix is not a magic square.");
	        }
	}

private boolean magicMatrix(int[][] matrix){
	if (!isSquare(matrix)){
		return false;
	}
	int n = matrix.length;
	for(int i =1;i<= n * n  ; i++){
		if(!contains(matrix,i)){
			return false;
		}
	}
	return true;
}

	private boolean isSquare(int[][] matrix) {
		for (int i = 0; i < matrix[i].length ; i++) {
			if (matrix.length != matrix[i].length) {
				return false;
			}
		}
		return true;
	}

	private boolean contains(int[][] matrix, int number) {
		for (int i = 0; i < matrix[i].length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					return true;
				}
			}
		}
		return false;

	}
}