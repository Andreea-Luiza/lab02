package ro.ase.cts.lab02.exceptions;

public class AmountDiscountValueException extends Exception{
    @Override
    public String getMessage() {

        return "Discount-ul nu ar trebui sa fie egal sau mai mare decat pretul produsului!";
    }
}
