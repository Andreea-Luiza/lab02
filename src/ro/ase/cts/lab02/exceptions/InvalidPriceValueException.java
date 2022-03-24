package ro.ase.cts.lab02.exceptions;

public class InvalidPriceValueException extends Exception {

    @Override
    public String getMessage() {
        return "Pretul nu poate fi mai mic decat 0.";
    }
}
