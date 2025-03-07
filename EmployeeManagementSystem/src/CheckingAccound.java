public class CheckingAccound extends BankAccound {

    public CheckingAccound(String AccoundHolder, double Balance) {
        super(AccoundHolder, Balance);
    }

    @Override
    public double CalculateInterest() {
        System.out.println("Checking Accound Interest");
        return Balance;
    }
}
