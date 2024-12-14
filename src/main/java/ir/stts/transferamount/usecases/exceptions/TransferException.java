package ir.stts.transferamount.usecases.exceptions;

public class TransferException extends RuntimeException {
    public TransferException(String message) {
        super(message);
    }
}
