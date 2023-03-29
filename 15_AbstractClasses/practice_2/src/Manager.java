package src;

public class Manager extends Worker {
    private int sales = (int) (Math.random() * (140000 - 115000) + 115000);

    public Manager(int salary) {
        super(salary);
    }

    @Override
    public int getMonthSalary() {
        return (int) (super.getMonthSalary() + sales * 0.05);
    }

    public int getSales() {
        return sales;
    }
}
