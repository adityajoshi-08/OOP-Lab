package Exercises;

class Employee{
    String name;
    double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{
    String department;

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
public class Exercise2_4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ramu", 5000);
        Employee e2 = new Employee("Shamu", 6000);

        Manager m1 = new Manager("Manager1", 50000, "IT");
        Manager m2 = new Manager("Manager2", 80000, "Research");

        System.out.println(e1.toString());
        System.out.println(m2.toString());
    }
}
