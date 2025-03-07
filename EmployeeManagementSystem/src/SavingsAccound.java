public class SavingsAccound extends BankAccound {

    public SavingsAccound(String AccoundHolder, double Balance) {
        super(AccoundHolder, Balance);
    }

    @Override
    public double CalculateInterest() {
        return Balance * 0.05;
    }
}
