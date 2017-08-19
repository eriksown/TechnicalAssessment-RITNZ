import org.testng.Assert;
import org.testng.annotations.Test;
  
public class addNumbersAcceptanceTest {
@Test 
  public static boolean isInt(String s)
    { 
      try {
        int i = Integer.parseInt(s);
        Assert.assertEquals(true, isInt(s));
      }
      catch(NumberFormatException er) {
        return false;
      }
    }
}
