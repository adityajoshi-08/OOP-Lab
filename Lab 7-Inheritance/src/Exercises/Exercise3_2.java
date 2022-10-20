package Exercises;

abstract class Worker{
    String name;
    double salary_rate;
    public abstract double computePay();

    public Worker(String name, double salary_rate) {
        this.name = name;
        this.salary_rate = salary_rate;
    }

    public String getName() {
        return name;
    }

    public double getSalary_rate() {
        return salary_rate;
    }
}

class FullTimeWorker extends Worker{
    int hours_worked;


    public FullTimeWorker(String name, double salary_rate, int hours_worked) {
        super(name, 100);
        this.hours_worked = hours_worked;
    }


    public double computePay() {
        return 100 * hours_worked;
    }
}

class HourlyWorker extends Worker{
    int hours_worked;

    public HourlyWorker(String name, double salary_rate, int hours_worked) {
        super(name, salary_rate);
        this.hours_worked = hours_worked;
    }

    public double computePay() {
        return 50 * hours_worked;
    }
}

public class Exercise3_2 {
    public static void main(String[] args) {
        FullTimeWorker f1 = new FullTimeWorker("Ramu", 500, 15);
        HourlyWorker h1 = new HourlyWorker("Shamu", 100, 54);
        System.out.println(f1.computePay());
        System.out.println(h1.computePay());
    }
}
