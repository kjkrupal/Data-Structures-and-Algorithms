import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Solution implements Cloneable {
    int x;
    int y;
    Anagram anagram;

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();
        solution.x = 1;
        solution.y = 2;
        solution.anagram = new Anagram();

        Solution solution2 = (Solution) solution.clone();

        System.out.println(solution.anagram + " " + solution2.anagram);

    }

    public Anagram getAnagram() {
        return anagram;
    }
}