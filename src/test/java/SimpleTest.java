
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void passingTest(){
        System.out.println("This test will alwa ys pass!");
    }
    @Test
    public void secondTest(){
        System.out.println("never  failed   test");
    }
    @Test
    public void failingTest() {
       // Assert.fail( "Failing test" );
    }
}
