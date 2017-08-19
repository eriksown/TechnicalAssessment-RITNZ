import org.testng.Assert;
import org.testng.annotations.Test;
  
public class addNumbersAcceptanceTest {
  public int i;
  public int j;
  
@Test 
  public boolean isInt(String a, String b)
    { 
      try {
        i = Integer.parseInt(a);
        j = Integer.parseInt(b);
        Assert.assertEquals(true, isInt(i));
        Assert.assertEquals(true, isInt(j));
      }
      catch(NumberFormatException er) {
        return false;
      }
    }
}
