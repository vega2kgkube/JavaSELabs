package workshop.oop.flexible;
/* ������ Ŭ���� */
public class Manager extends Employee {
    public Manager (String name, double salary) {
//        this.name = name;
//        this.salary = salary;
    	super(name,salary);
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
        salary += 20; // 20������ �߰��� �޴´�.
    }
}
