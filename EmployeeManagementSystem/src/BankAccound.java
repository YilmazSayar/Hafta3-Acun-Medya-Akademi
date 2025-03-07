public abstract class BankAccound {

    protected String AccoundHolder;
    protected double Balance;

    public BankAccound(String AccoundHolder, double Balance) {
        this.AccoundHolder = AccoundHolder;
        this.Balance = Balance;
    }

    public abstract double CalculateInterest();

    public void displayaccoundinfo(){

        System.out.println("Accound Holder: " + AccoundHolder);
        System.out.println("Balance: " + Balance);

    }
}
