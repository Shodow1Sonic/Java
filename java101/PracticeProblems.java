
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
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 2;
        int result = countOccurances(arr, n);
        System.out.println(result);
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
}