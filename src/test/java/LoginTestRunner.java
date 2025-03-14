import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",  // Dossier des fichiers .feature
        glue = "steps",                           // Dossier des définitions de step
        plugin = {"pretty", "html:target/cucumber-reports-login.html"} // Génération des rapports
)
public class LoginTestRunner {
}