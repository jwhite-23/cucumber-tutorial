package JavaProjects.CucumberTutorial;

import static org.assertj.core.api.Assertions.assertThat;

import JavaProjects.CucumberTutorial.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CalculatorStepDefinitions {
	
	Calculator calculator;
	int result;

	@Given("I have a calcualtor")
	    public void i_have_a_calculator() { calculator = new Calculator(); 
	    }
	

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	    result = calculator.add(int1, int2);
	    }

	@Then("I should get {int}")
	public void i_should_get(Integer expectedResult) {
			assertThat(result).isEqualTo(expectedResult);
		}



}
