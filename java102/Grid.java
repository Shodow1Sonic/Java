import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	private static int maxSideLength = 0;   //Part of Practice: maxSideLength
	public final int sideLength;

    @SuppressWarnings("Convert2Diamond")
	public Grid(int sideLength, T defaultVal) {
        this.sideLength = sideLength;
        this.grid = new ArrayList<ArrayList<T>>(sideLength);
        for (int i = 0; i < sideLength; i++) {
            grid.add(new ArrayList<>(sideLength));
            for (int j = 0; j < sideLength; j++) {
                grid.get(i).add(defaultVal);
            }
        }

        if (sideLength > maxSideLength) {   //Part of Practice: maxSideLength
            maxSideLength = sideLength;     //Part of Practice: maxSideLength
        }                                   //Part of Practice: maxSideLength

    }
	
	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}


	//Practice: Diagonal        
	@SuppressWarnings("Convert2Diamond")
	public ArrayList<T> diagonal() {
		ArrayList<T> diag = new ArrayList<T>();
		for (int i = 0; i < this.sideLength; i++) {
			diag.add(this.get(i, i));
		}
		return diag;
	}

	//Practice: maxSideLength
	public static int maxSideLength() {
		return maxSideLength;
	} //Lines 5, 19, 20, and 21 are all part of this practice problem as well.
}
