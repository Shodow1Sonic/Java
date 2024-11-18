
public class PracticeProblems {
    //Problem #1
	public static int countOccurances(int[] arr, int n) {
        int ncounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                ncounter++;
            }
        }
        return ncounter;
    }
    
    //Problem #2
    public static int[] reverseArray(int[] arr) {
        int[] revarr = new int[arr.length];
        int j = 0;
        for (int i = arr.length; i >= 0; i--) {
            revarr[j] = arr[i];
            j++;
        }
        return revarr;
    }

    //Problem #3
}