package inheritance;

/**
 * @author xubowen
 */
public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    @Override
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double abonus)
    {
        bonus = abonus;
    }
}
