package learn.ehcache;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SquaredCalculatorTest {

    @Test
    public void whenCalculatingSquareValueAgain_thenCacheHasAllValues(){
        SquaredCalculator squaredCalculator = new SquaredCalculator();
        CacheHelper cacheHelper = squaredCalculator.getCacheHelper();
        for(int i = 10; i < 15; i++){
            assertFalse(cacheHelper.getNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: "
                    + squaredCalculator.getSquareValueOfNumber(i));
        }

        for(int i = 10; i < 15; i++){
            assertTrue(cacheHelper.getNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: "
                    + squaredCalculator.getSquareValueOfNumber(i));
        }
    }
}
