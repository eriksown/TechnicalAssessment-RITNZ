import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class addTwoNumbers {
	int result;
	
  	@When ('^I add the two numbers$')
		public void addInt(int i, int j) throws Throwable {
			result = i + j;
		}
  	@Then ('^result will be returned$')
		public int sumResult() throws Throwable {
			return result;
		}
	}

}
