package junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    TestStringConcat.class,
    TestSort1.class,
    TestCheckPresence.class
})
public class AllTests {

}