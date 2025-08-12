package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;

// Account.java - �⺻ ���� Ŭ����
public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    public Account(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("�Աݾ��� ������� �մϴ�.");
        }
        balance += amount;
        System.out.println(amount + "���� �ԱݵǾ����ϴ�. ���� �ܾ�: " + balance + "��");
    }
    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("��ݾ��� ������� �մϴ�.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("�ܾ��� �����մϴ�.");
        }
        balance -= amount;
        System.out.println(amount + "���� ��ݵǾ����ϴ�. ���� �ܾ�: " + balance + "��");
    }
    
    @Override
    public String toString() {
        return "���¹�ȣ: " + accountNumber + ", ������: " + ownerName + ", �ܾ�: " + balance + "��";
    }
}