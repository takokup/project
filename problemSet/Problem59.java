import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram {

    public void run() {
        int[][] m = new int[5][8]; 

        int maxLen = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 1) {
                    int x = i;
                    while (x < m.length && m[x][j] == 1) {
                        int r = 0;
                        while (j + r < m[0].length && m[i][j + r] == 1 && m[x][j + r] == 1) {
                            r++;
                        }
                        int width = j + r - i + 1;
                        int height = x - i + 1;
                        int area = width * height;
                       maxLen = Math.max(maxLen, area);
                        x++;
                    }
                }
            }
        }

        println(maxLen);
    }
}