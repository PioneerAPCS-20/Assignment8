

public class Runner
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Bob", "Accounting");
        e1.printInfo();
        String name = e1.getName();
        System.out.println(name);

        Employee e2 = new Employee("Roberta", "Marketing");
        //e2.changeDepartment("Finance");
        e2.changeDepartment("Finance");
        e2.printInfo(); 
    }
}
