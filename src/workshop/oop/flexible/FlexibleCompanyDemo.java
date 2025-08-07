package workshop.oop.flexible;

public class FlexibleCompanyDemo {
    public static void main(String[] args) {
        
        MereClerk mereClerk1 = new MereClerk("ö��", 100);
        MereClerk mereClerk2 = new MereClerk("����", 100);
        Manager manager = new Manager("ȫ�浿", 200);
        
        // �ڽ� mgr = new �ڽ�
        Manager hrMgr = new Manager("�Ѹ�",200,"HR");
        System.out.println(hrMgr.getName());
        System.out.println(hrMgr.getSalary());
        System.out.println(hrMgr.getDept());
        
        //������(Polymorphism) Poly(�پ���) + Morphism(����,����)
        Employee itMgr = new Manager("�浿",250,"IT");
        System.out.println(itMgr.getName());
        System.out.println(itMgr.getSalary());
        //Manager(�ڽ�)�� ���� getDept() �޼��� ȣ���ϱ�
        Manager itMgr2 = (Manager)itMgr;
        
        
        System.out.println("���� �����Դϴ�.");
        
        System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");
        System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");
        System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");

        System.out.println("");
        
        
        System.out.println("�ø� ���� �����Դϴ�.");
        
        mereClerk1.manageSalary(10);
        System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");
        
        mereClerk2.manageSalary(10);
        System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");
        
        manager.manageSalary(10);
        System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");
        
   }
}

