

public class Employee
{
    // Instance variables (private)

    private int id;
    private String name;
    private String department;

    
    // Constructor

    public Employee(String n, String d)
    {
        name = n;
        department = d;
        id = generateId();
    }

    public int generateId()
    {
        int i = 0;
        // do some stuff to get next id
        return i;
    }

    // Getter
    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getId()
    {
        return id;
    }

    // Setter
    public void changeDepartment(String newDep)
    {
        department = newDep;
    }

    public void printInfo()
    {
        System.out.println(name);
        System.out.println("ID: " + id);
        System.out.println("Dep: " + department);
    }
}
