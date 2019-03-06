import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<Long>();

        for(long i = 0; i < 92233720368547758l; i++){
            list.add(i);
        }

        List<Long> list1 = new ArrayList<>();

        long start1 = System.nanoTime();
        for(long i : list){
            if(i % 2 == 0)
                list1.add(i);
        }
        long end1 = System.nanoTime();

        long t1 = (end1 - start1) / 1000000;

        long start2 = System.nanoTime();
        List<Long> list2 = list.stream()
                .parallel()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        long end2 = System.nanoTime();

        long t2 = (end2 - start2) / 1000000;

        System.out.println("Time w/o streams: " + t1);
        System.out.println("Time w streams: " + t2);
        System.out.println("Difference: " + (t1 - t2));
    }

}
