
public class PracticeProblems {
    //Problem #1
	public static int countOccurances(int[] arr, int n) {
        int ncount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                ncount++;
            }
        }
        return ncount;
    }
    
    //Problem #2
    public static int[] reverseArray(int[] arr) {
        int[] revarr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revarr[j] = arr[i];
            j++;
        }
        return revarr;
    }

    //Problem #3
    public static double sumGrid(double[][] grid) {
        double sum = 0.0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    //Problem #4
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}