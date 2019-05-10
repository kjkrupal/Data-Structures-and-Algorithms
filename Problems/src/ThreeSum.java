import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {
    public static void main(String[] args) {

        int a[] = {21, 20, 3, 45, 67, 8};
        int sum = 31;

        threeSum(a, sum);

    }

    public static void threeSum(int[] nums, int sum) {

        int a[] = new int[3];

        for(int i = 0; i < nums.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            int target = sum - nums[i];

            for(int j = 0; j < nums.length; j++) {

                if(i == j)
                    continue;

                int comp = target - nums[j];

                if(map.containsKey(comp)) {
                   a[0] = i;
                   a[1] = map.get(comp);
                   a[2] = j;
                   break;
                }
                map.put(nums[j], j);

            }

            map.clear();

        }

        System.out.println(Arrays.toString(a));

    }
}
