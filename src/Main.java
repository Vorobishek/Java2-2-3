public class Main {
    public static void main(String[] args) {
        calculateCreditPayment(1_000_000, 9.99, 12);
        calculateCreditPayment(1_000_000, 9.99, 24);
        calculateCreditPayment(1_000_000, 9.99, 36);
    }

    private static void calculateCreditPayment(double creditSum, double creditPercent, int creditMonth) {
       CreditPaymentService creditPaymentService = new CreditPaymentService();

       double creditPayment = creditPaymentService.calculate(creditSum, creditPercent, creditMonth);

       System.out.printf("Sum: %.2f, Percent: %.2f, Month: %s, Payment: %.2f", creditSum, creditPercent, creditMonth, creditPayment);
       System.out.println();
    }

}

