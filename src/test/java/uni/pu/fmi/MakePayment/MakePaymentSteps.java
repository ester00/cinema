package uni.pu.fmi.MakePayment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class MakePaymentSteps {

    private MakePaymentModel paymentModel = new MakePaymentModel();

    @Given("a user with id {string} wants to make a payment of {float}")
    public void aUserWithIdWantsToMakeAPaymentOf(String userId, float amount) {
        paymentModel.setUserId(userId);
        paymentModel.setAmount(amount);
    }

    @When("the user confirms the transaction")
    public void theUserConfirmsTheTransaction() {
        paymentModel.confirmTransaction();
    }

    @Then("the payment should be processed successfully")
    public void thePaymentShouldBeProcessedSuccessfully() {
        assertTrue(paymentModel.isTransactionSuccessful());
    }

    @Given("a user with id {string} has made a payment of {float}")
    public void aUserWithIdHasMadeAPaymentOf(String userId, float amount) {
        paymentModel.setUserId(userId);
        paymentModel.setAmount(amount);
        paymentModel.confirmTransaction();
    }

    @When("the user cancels the transaction")
    public void theUserCancelsTheTransaction() {
        paymentModel.returnMoneyOnCancellation();
    }

    @Then("the payment should be cancelled successfully")
    public void thePaymentShouldBeCancelledSuccessfully() {
        assertTrue(paymentModel.isTransactionCancelled());
    }
}
