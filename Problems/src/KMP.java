import java.util.ArrayList;
import java.util.List;

public class KMP {
    public static void main(String[] args) {
        KMP kmp = new KMP();
        System.out.println(kmp.isSubsequence("abc", "abcbcabcabc"));
    }
    public List<Integer> isSubsequence(String ss, String tt) {

        List<Integer> list = new ArrayList<>();
        char[] t = tt.toCharArray();
        char[] s = ss.toCharArray();

        int [] table = new int[t.length];

        constructTable(table, s, t);

        int i = 0;
        int j = 0;

        while(i != t.length) {
            if(t[i] == s[j]) {
                i++;
                j++;
                if(j == s.length) {
                    list.add(i - s.length);
                    j = 0;
                }
            }
            else {
                j = table[j];
                i++;
            }

        }

        return list;
    }

    public void constructTable(int[] table, char[] t, char[] s) {
        int j = 0;
        for(int i = 1; i < t.length; i++) {
            if(t[i] == t[j]) {
                j++;
                table[i] = j;
            }
            else {
                while(j != 0 && t[i] != t[j]) {
                    j = table[--j];
                }
                if(t[i] == t[j]) {
                    table[i] = ++j;
                }
            }
        }
    }

}