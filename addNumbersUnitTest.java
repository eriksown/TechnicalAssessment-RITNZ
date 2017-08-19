import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class addTwoNumbers {
   private int result;
   @When ('^I add the two numbers$')
	public void addInt(addNumbersAcceptanceTest.i, addNumbersAcceptanceTest.j) throws Throwable {
		result = addNumbersAcceptanceTest.i + addNumbersAcceptanceTest.j;
	}
   @Then ('^result will be returned$')
	public int sumResult() throws Throwable {
		return result;
	}
}
