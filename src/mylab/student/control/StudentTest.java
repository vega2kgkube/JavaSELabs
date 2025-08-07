package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {
    public static void main(String[] args) {
    	
    	try {
			Student s = new Student("2023001", "��μ�", "��ǻ�Ͱ���", 3);
			System.out.println(s.getName() + " / " + s.getMajor() + " / " + s.getGrade() + "�г�" );
			System.out.println("5�г����� ���� ");
			s.setGrade(5); // ���� ���
		} catch (InvalidGradeException e) {
			System.out.println(e.getMessage());			
		}
        
    }
}