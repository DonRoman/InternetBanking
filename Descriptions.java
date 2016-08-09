package Banking;

/**
 * Created by User on 01.08.2016.
 */
public class Descriptions {

    private String name;

    public Descriptions(PaymentType type) {
        name = getPaymentTipe(type);
    }

    public String getName() {
        return name;
    }

    public void setName(PaymentType type) {
        this.name = getPaymentTipe(type);
    }

    public String getPaymentTipe(PaymentType type) {
        String result = "";
        switch (type) {
            case paymentForServices:
                result = "paymentForServices";

            case TransferPersonally:
                result = "TransferPersonally";

            case transferToAnotherPerson:
                result = "transferToAnotherPerson";

            case userPaying:
                result = "userPaying";

            default:

                break;
        }
        return result;
    }
}