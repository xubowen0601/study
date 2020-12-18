package equals;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [toString,hashCode,equals方法]
 * @createTime : [2020/12/16 17:12]
 * @updateUser : [xubowen]
 * @updateTime : [2020/12/16 17:12]
 * @updateRemark : [首次]
 */
public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject))
        {
            return false;
        }
        Manager other = (Manager) otherObject;
//        super.equals checked that this and other belong to the same class
//        super.equals检查this和other是否属于同一类
        return bonus == other.bonus;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "[bonus=" + bonus +
                ']';
    }
}
