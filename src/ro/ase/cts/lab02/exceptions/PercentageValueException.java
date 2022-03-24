package ro.ase.cts.lab02.exceptions;

public class PercentageValueException  extends Exception {

    @Override
    public String getMessage() {

        return "Procentajul are valori cuprinse intre 0 si 100";
    }
}
