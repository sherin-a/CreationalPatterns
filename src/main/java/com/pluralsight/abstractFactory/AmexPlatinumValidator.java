package com.pluralsight.abstractFactory;

public class AmexPlatinumValidator extends Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
