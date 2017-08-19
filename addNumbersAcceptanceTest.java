package stepDefinition;

import org.testng.Assert;
import org.testng.annotations.Test;
  
public class addNumbersAcceptanceTest {
  static int i;
  static int j; 
  
@Test 
  public boolean isInt(String a, String b) { 
	
      try {
        setI(Integer.parseInt(a));
        setJ(Integer.parseInt(b));
        Assert.assertEquals(true, getI());
        Assert.assertEquals(true, getJ());
        
        return true;
      }
      catch(NumberFormatException er) {
        return false;
      }
  }

	public static int getI() {
		return i;
	}
	
	public void setI(int i) {
		addNumbersAcceptanceTest.i = i;
	}
	
	public static int getJ() {
		return j;
	}
	
	public void setJ(int j) {
		addNumbersAcceptanceTest.j = j;
	}
}
