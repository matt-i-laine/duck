/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package school.learncoding.cleanjava.annotations;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class DuckTest {
    @Test public void someLibraryMethodReturnsTrue() {
        Duck classUnderTest = new Duck();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
