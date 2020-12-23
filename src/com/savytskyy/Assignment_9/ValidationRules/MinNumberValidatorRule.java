package com.savytskyy.Assignment_9.ValidationRules;

public class MinNumberValidatorRule<T> implements ValidatorRule<T> {
    Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(T value) {
        return (double)value>=minValue.doubleValue();
    }

    @Override
    public String errorMessage() {
        return "The number is smaller than the minimum allowed";
    }


}
