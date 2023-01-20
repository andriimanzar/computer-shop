package exception;

public class NotAvailableToPurchaseException extends RuntimeException {

  public NotAvailableToPurchaseException(String message) {
    super(message);
  }
}
