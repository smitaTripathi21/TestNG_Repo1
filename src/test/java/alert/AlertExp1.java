package alert;



import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExp1 {
	    @Test
	    public void testAdditionShouldFail() {
	        int result = 2 + 2;
	        Assert.assertEquals(result, 5, "Expected 5 but got " + result);
	    }
}
