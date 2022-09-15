package com.pluralsight.abstractFactory;

public class AmexGoldValidator extends Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
