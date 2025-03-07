public abstract class Employee {

int id;
String name;
Double salary;
String department;


public Employee(int id, String name, Double salary, String Department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = Department;

}

public abstract double calculateBonus();


    protected void displayinfo() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);


    }
}
