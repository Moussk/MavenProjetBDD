import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class MyStepdefs {
    @When("^the search phrase \"([^\"]*)\" is entered$")
    public void theSearchPhraseIsEntered(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Voici le resultat");
        throw new PendingException();
    }
}
