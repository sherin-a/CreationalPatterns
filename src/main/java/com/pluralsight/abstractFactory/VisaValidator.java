package com.pluralsight.abstractFactory;

public class VisaValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
