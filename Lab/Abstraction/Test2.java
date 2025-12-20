package Lab.Abstraction;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("Employee name:" + name);
        System.out.println("Salary:" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class Test2 {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee("Zaima", 100000);
        fte.showDetails();
    }
}
