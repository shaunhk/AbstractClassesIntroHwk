package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;

    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double payRise) {
        if(payRise >= 0){
            this.salary += payRise;
        }
    }

    public double getPayBonus() {
        return this.salary / 100;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
