package learn.ehcache;

import org.ehcache.Cache;

public class SquaredCalculator {
    private CacheHelper cacheHelper = new CacheHelper();

    public CacheHelper getCacheHelper(){
        return cacheHelper;
    }

    public int getSquareValueOfNumber(int number){
        //check cache
        Cache<Integer, Integer> cache = cacheHelper.getNumberCache();
        if(cache.containsKey(number)){
            System.out.println("Found result in cache and return");
            return cache.get(number);
        }

        System.out.println("Calculate the square value of " + number + " and cache result.");
        //calculate and put into cache
        int square = number * number;
        cache.put(number, square);
        return square;
    }
}
