import java.util.ArrayList;
import java.util.List;

public class RabinKarp {
    public static void main(String[] args) {

        char[] text = {'a', 'b', 'e', 'c', 'd', 'a', 'b', 'e', 'a', 'b', 'e'};
        char[] pattern = {'a', 'b', 'e'};

        System.out.println(rabinKarp(text, pattern));

    }

    public static List<Integer> rabinKarp(char[] text, char[] pattern) {

        int pattern_hash = createHash(pattern, 0, pattern.length - 1);
        int m = text.length;
        int n = pattern.length;

        int hash = 0;

        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i <= m - n; i++) {

            if(i == 0) {
                hash = createHash(text, i, i + n - 1);
            }

            else {
                hash = rehash(text[i - 1], hash, text[i + n - 1], pattern.length - 1);
            }
            if(hash == pattern_hash && match(i, i + n - 1, text, pattern))
                indexes.add(i);

        }

        return indexes;

    }

    public static int createHash(char[] string, int s, int e) {
        int prime = 17;

        int hash = 0;

        for(int i = s; i <= e; i++) {
            hash += (int) string[i] * Math.pow(prime, i);
        }

        return hash;
    }

    public static int rehash(char c, int hash, char s, int len) {
        int prime = 17;

        hash = (hash - (int)c)/prime;

        hash = hash + (int) s * (int) Math.pow(prime, len);

        return hash;

    }

    public static boolean match(int s, int e, char[] text, char[] pattern) {

        int i = 0;
        while(s <= e) {

            if(text[s] == pattern[i]) {
                s++;
                i++;
            }
            else
                return false;
        }

        return true;
    }
}
