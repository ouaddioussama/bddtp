package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


//Step Definitions
public class LoginSteps {

    private String username;
    private String password;
    private boolean isLoggedIn;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        // Simulation de la page de login
        System.out.println("User is on the login page");
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        // Simulation d'une connexion avec des informations valides
        username = "user";
        password = "password123";
        isLoggedIn = true;  // Suppose que la connexion est réussie
        System.out.println("User enters valid credentials");
    }

    @When("the user enters invalid credentials")
    public void userEntersInvalidCredentials() {
        // Simulation d'une connexion avec des informations invalides
        username = "user";
        password = "wrongpassword";
        isLoggedIn = false;  // Suppose que la connexion échoue
        System.out.println("User enters invalid credentials");
    }

    @Then("the user should be redirected to the homepage")
    public void userIsRedirectedToHomepage() {
        assertTrue(isLoggedIn);  // Vérification que l'utilisateur est connecté
        System.out.println("User is redirected to the homepage");
    }

    @Then("an error message should be displayed")
    public void errorMessageIsDisplayed() {
        assertFalse(isLoggedIn);  // Vérification que la connexion a échoué
        System.out.println("Error message is displayed");
    }
}