package mylab.bank.control;

import mylab.bank.entity.Bank;
import mylab.bank.entity.SavingsAccount;
import mylab.bank.exception.AccountNotFoundException;
import mylab.bank.exception.InsufficientBalanceException;
import mylab.bank.exception.WithdrawalLimitExceededException;

// BankDemo.java - �׽�Ʈ Ŭ����
public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        try {
            // ���� ����
        	System.out.println("=== ���� ���� ===");
            String savingsAccount1 = bank.createSavingsAccount("ȫ�浿", 10000, 0.03);
            String checkingAccount1 = bank.createCheckingAccount("��ö��", 20000, 5000);
            String savingsAccount2 = bank.createSavingsAccount("�̿���", 30000, 0.02);
            
            System.out.println();
            bank.printAllAccounts();
            System.out.println();
            
            // �Ա�/��� �׽�Ʈ
            System.out.println("=== �Ա�/��� �׽�Ʈ ===");
            bank.deposit(savingsAccount1, 5000);
            bank.withdraw(checkingAccount1, 3000);
            System.out.println();
            
            // ���� ���� �׽�Ʈ
            System.out.println("=== ���� ���� �׽�Ʈ ===");
            ((SavingsAccount)bank.findAccount(savingsAccount1)).applyInterest();
            
            System.out.println();
            
            // ���� ��ü �׽�Ʈ
            System.out.println("=== ���� ��ü �׽�Ʈ ===");
            bank.transfer(savingsAccount2, checkingAccount1, 5000);
            
            System.out.println();
            bank.printAllAccounts();
            
            // ���� �׽�Ʈ
            try {
                bank.withdraw(checkingAccount1, 50000); // �ܾ� ����
            } catch (InsufficientBalanceException e) {
                System.out.println("���� �߻�: " + e.getMessage());
            }
            
            try {
                bank.withdraw(checkingAccount1, 10000); // ��� �ѵ� �ʰ�
            } catch (WithdrawalLimitExceededException e) {
                System.out.println("���� �߻�: " + e.getMessage());
            }
            
            try {
                bank.findAccount("AC9999"); // �������� �ʴ� ����
            } catch (AccountNotFoundException e) {
                System.out.println("���� �߻�: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("���� �߻�: " + e.getMessage());
            e.printStackTrace();
        }
    }
}