package abstractclasses;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [学生]
 * @createTime : [2020/12/15 10:41]
 * @updateUser : [xubowen]
 * @updateTime : [2020/12/15 10:41]
 * @updateRemark : [首次修改]
 */
public class Student extends Person
{
    private String major;

    public Student(String name, String major)
    {
//        pass n to superclass constructor
//        将n传递给超类构造函数
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription()
    {
        return "这个学生的专业是" + major;
    }
}
