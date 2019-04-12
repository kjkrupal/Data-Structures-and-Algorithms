import java.util.Arrays;
import java.util.List;

public class Cell {

    public static void main(String[] args) {
        new Cell().question();
    }
    public void question() {
        cellComplete(new int[]{0,1,0,1,1,1,0,1}, 5);
    }

    public List<Integer> cellComplete(int states[], int days) {

        //for(int j = 0; j < days; j++) {

            int value = 0;
            Arrays.sort(states);
        System.out.println(states);

        //}

        return null;
    }
}
