package ro.ase.cts.lab02.exceptions;

public class StringMinLengthException extends Exception {

    @Override
    public String getMessage() {
        return "Lungimea nu poate fi mai mica decat 5.";
    }
}
