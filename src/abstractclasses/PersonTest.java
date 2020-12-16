package abstractclasses;

import static java.lang.System.*;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [test]
 * @createTime : [2020/12/15 10:45]
 * @updateUser : [xubowen]
 * @updateTime : [2020/12/15 10:45]
 * @updateRemark : [test]
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];
//        fill the people array with Student and Employee objects
//        用Student和Employee对象填充人员数组
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "计算机科学");

//        print out names and descriptions of all Person objects
//        打印出所有Person对象的名称和描述
        for (Person p : people)
        {
            out.println(p.getName() + "," + p.getDescription());
        }
    }
}
