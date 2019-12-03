import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class PrintResultsTest {
    CleanTheJerk cleaner;
    FindPatterns finder;
    PrintResults printer;

    @Before
    public void setUp() throws Exception {
        cleaner = new CleanTheJerk();
        finder = new FindPatterns();
        printer = new PrintResults();
    }

    @Test
    public void checkMilk () {
       Map<String, Long> myMap = printer.resultsMap();
        System.out.println(myMap.entrySet());
    }
}