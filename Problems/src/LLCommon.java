import java.util.*;

public class LLCommon {

    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();

        for(int i = 1; i <= 40; i++) {
            l1.add(i);
            l1.add(i);
        }

        for(int i = 10; i <= 35; i++) {
            l2.add(i);
        }

        List<Integer> common = getCommon(l1, l2);

        System.out.println(common.toString());


    }

    public static List<Integer> getCommon(List<Integer> l1, List<Integer> l2) {
        List<Integer> lc = new ArrayList<>();

        Set<Integer> map = new HashSet<>();

        for(Integer i : l1) {
            map.add(i);
        }

        for(Integer i : l2) {
            if(map.contains(i)) {
                lc.add(i);
            }

        }

        return lc;
    }

}
