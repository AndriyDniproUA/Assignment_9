package com.savytskyy.Assignment_9.ValidationRules;

public class StartsWithValidatorRule <T> implements ValidatorRule <T>{
    String start;

    public StartsWithValidatorRule(String start) {
        this.start = start;
    }

    @Override
    public boolean validate(T value) {
        return ((String)value).startsWith(start);
    }

    @Override
    public String errorMessage() {
        return "The String does no start with the specified substring";
    }
}
