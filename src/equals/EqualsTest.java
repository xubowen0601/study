package equals;

import static java.lang.System.*;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [toString,hashCode,equals方法]
 * @createTime : [2020/12/16 17:10]
 * @updateUser : [xubowen]
 * @updateTime : [2020/12/16 17:10]
 * @updateRemark : [首次]
 */
public class EqualsTest
{
    public static void main(String[] args)
    {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

        out.println("alice1 == alice2: " + (alice1 == alice2));

        out.println("alice1 == alice3: " + (alice1 == alice3));

        out.println("alice.equals(alice3): " + alice1.equals(alice3));

        out.println("alice.equals(bob): " + alice1.equals(bob));

        out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        out.println("carl.toString(): " + carl);
        out.println("boss.toString(): " + boss);
        out.println("carl.equals(boss): " + carl.equals(boss));
        out.println("alice1.hashCode(): " + alice1.hashCode());
        out.println("alice3.hashCode(): " + alice3.hashCode());
        out.println("bob.hashCode(): " + bob.hashCode());
        out.println("carl.hashCode(): " + carl.hashCode());
        out.println("boss.hashcode(): " + boss.hashCode());

    }
}
