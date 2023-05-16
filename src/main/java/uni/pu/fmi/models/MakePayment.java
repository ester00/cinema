package uni.pu.fmi.models;

public class MakePayment {

    public Character id;
    public Float amount;
    public Integer transactionId;
    public Character userId;

    public MakePayment() {
        // Default constructor
    }

    public void ConfirmTransaction() {
        System.out.println("Transaction " + transactionId + " confirmed.");
    }

    public void ReturnMoneyOnCancelation() {
        System.out.println("Money has been returned.");
    }
}
