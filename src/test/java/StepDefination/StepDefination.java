package StepDefination;

import java.util.List;

import AllMethod.AllMethod;
import Operator.Operator;
import PracticeInfo.MyPractice;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination extends MyPractice  {
	AllMethod obj = new AllMethod();

	   
	
@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
	System.out.println("a");
    
}

@Given("some other precondition")
public void some_other_precondition() {
	System.out.println("b");
   
}

@When("I complete action")
public void i_complete_action() {
	System.out.println("c");
}

@When("some other action")
public void some_other_action() {
	System.out.println("d");
    
}
@Given("user do intial setup")
public void user_do_intial_setup() {
	System.out.println("user launch browser");
}

@When("I click on {string} label")
public void i_click_on_label(String v) throws InterruptedException {
    
    MyPractice.GenericMethod(v);
}
@When("user fills infromation in the following fields")
public void user_fills_infromation_in_the_following_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
   List<String> data = dataTable.asList();
   System.out.println(data.toString());
   obj.fieldMenu(data);
}

@When("I click on {string} button")
public void i_click_on_button(String string) throws InterruptedException {
   obj.btnClick(string);
	
}
@When("I navigate to {string}")
public void i_navigate_to(String string) throws InterruptedException {
   obj.openMenu(string);
}






}
