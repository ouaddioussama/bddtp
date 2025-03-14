package steps;

 import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
 import org.example.Calculator;

 import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(int number1, int number2) {
        result = calculator.add(number1, number2);
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(int number1, int number2) {
        result = calculator.subtract(number1, number2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}