import org.testng.Assert;
import org.testng.annotations.Test;
  
public class addNumbersAcceptanceTest {
@Test 
  public boolean isInt(String s)
    { 
      try {
        int i = Integer.parseInt(s);
        Assert.assertEquals(true, isInt(i));
      }
      catch(NumberFormatException er) {
        return false;
      }
    }
}
