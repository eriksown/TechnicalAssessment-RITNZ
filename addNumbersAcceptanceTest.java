import org.testng.Assert;
import org.testng.annotations.Test;
  
public class addNumbersAcceptanceTest {
@Test 
  public boolean isInt(String a, String b)
    { 
      try {
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        Assert.assertEquals(true, isInt(i));
        Assert.assertEquals(true, isInt(j));
      }
      catch(NumberFormatException er) {
        return false;
      }
    }
}
