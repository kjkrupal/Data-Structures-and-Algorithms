public class LFUCacheImpl {
    public static void main(String[] args) {

        LFUCache cache = new LFUCache(0);

        cache.put(0, 0);
        System.out.println(cache.get(0));


    }
}
