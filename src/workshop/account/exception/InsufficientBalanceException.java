package workshop.account.exception;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String errMessage) {
		//�θ�Ŭ����(Exception)�� �����ڸ� ȣ���ϱ�
		super(errMessage);
	}
	
}
