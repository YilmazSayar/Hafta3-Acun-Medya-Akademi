//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Manager
    Manager manager1 = new Manager(101,"Yılmaz Sayar",120000.0, "Software Manager",8);
    Manager manager2 = new Manager (102,"İlkan Demir",105000.0,"Test Manager",4);
    //Developer
    Developer developer1 = new Developer(201,"Cansu",80000.0,"Java Developer");
    Developer developer2 = new Developer(202,"Mehmet",60000.0,"Java Developer");


        System.out.println("Manager info:");
        System.out.println(" ");
        manager1.displayinfo();
        System.out.println("Bonus: " + manager1.calculateBonus());
        System.out.println(" ");
        manager2.displayinfo();
        System.out.println("Bonus: " + manager2.calculateBonus());
        System.out.println("");


        System.out.println("Developer info:");
        developer1.displayinfo();
        System.out.println("Bonus: "+developer1.calculateBonus());
        System.out.println("");
        developer2.displayinfo();
        System.out.println("Bonus: "+developer2.calculateBonus());


        System.out.println("");

        BankAccound savingsaccount = new SavingsAccound("Ahmet Yıldıran",500000);
        BankAccound checkingaccount = new CheckingAccound("Melisa işitmeyen",4500);

        System.out.println("Savings account info:");
        savingsaccount.displayaccoundinfo();
        System.out.println("İnterest: "+savingsaccount.CalculateInterest());


        System.out.println("");

        System.out.println("Checking account info:");
        checkingaccount.displayaccoundinfo();
        System.out.println("İnterest: "+checkingaccount.CalculateInterest());



        }
    }
