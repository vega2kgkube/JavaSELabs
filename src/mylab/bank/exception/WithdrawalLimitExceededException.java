package mylab.bank.exception;

// WithdrawalLimitExceededException.java - ��� �ѵ� �ʰ� ����
public class WithdrawalLimitExceededException extends InsufficientBalanceException {
    public WithdrawalLimitExceededException(String message) {
        super(message);
    }
}