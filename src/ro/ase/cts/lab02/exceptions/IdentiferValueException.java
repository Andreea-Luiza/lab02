package ro.ase.cts.lab02.exceptions;

public class IdentiferValueException extends Exception{

    @Override
    public String getMessage() {

        return "Valoarea nu poate fi mai mica decat 1.";
    }
}
