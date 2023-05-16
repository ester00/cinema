package uni.pu.fmi.MakePayment;

public class MakePaymentModel {

    private String userId;
    private float amount;
    private boolean transactionSuccessful;
    private boolean transactionCancelled;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void confirmTransaction() {
        // TODO: Implement the logic of confirming the transaction
        // For now, just set transactionSuccessful to true
        transactionSuccessful = true;
    }

    public void returnMoneyOnCancellation() {
        // TODO: Implement the logic of returning money on cancellation
        // For now, just set transactionCancelled to true
        transactionCancelled = true;
    }

    public boolean isTransactionSuccessful() {
        return transactionSuccessful;
    }

    public boolean isTransactionCancelled() {
        return transactionCancelled;
    }
}
