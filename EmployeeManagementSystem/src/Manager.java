public class Manager extends Employee {

private int teamSize;

    public Manager(int id, String name, Double salary, String Department, int teamSize) {
        super(id, name, salary, Department);
        this.teamSize = teamSize;
    }


    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    public void displayinfo(){
        super.displayinfo();

        System.out.println("Team Size: " + teamSize);


    }


}
