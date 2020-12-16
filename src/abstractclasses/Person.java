package abstractclasses;

public abstract class Person
{
    /**
     * fetch data by rule id
     *
     * @param
     * @return Result<获取描述DO>
     */
    public abstract String getDescription();

    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
