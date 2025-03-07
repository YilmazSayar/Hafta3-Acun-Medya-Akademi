public class Developer extends Employee{

    private String About;

    public Developer(int id, String name, Double salary, String Department) {
        super(id, name, salary, Department);
        this.About = About;
    }


    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }

}
