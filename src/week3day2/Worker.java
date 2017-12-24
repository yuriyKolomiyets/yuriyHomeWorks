package week3day2;

public class Worker extends Human {

    private int salary;

    public Worker() {
    }

    public Worker(String name, int availableMoney, int salary) {
        super(name, availableMoney);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " ,"+
                "salary=" + salary;
    }
}
