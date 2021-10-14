public class CreditPaymentService {
    public double calculate (double creditSum, double creditPercent, int creditMonth){
        double creditPercentMonth = creditPercent / (100 * 12);
        double creditPayment = creditSum * (creditPercentMonth + (creditPercentMonth / (Math.pow(1 + creditPercentMonth, creditMonth) - 1)));

        return creditPayment;
    }
}
