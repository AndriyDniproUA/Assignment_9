package com.savytskyy.Assignment_9.ValidationRules;

import com.savytskyy.Assignment_9.ValidationRules.ValidatorRule;

public class MaxNumberValidatorRule <T> implements ValidatorRule<T> {
    Number maxValue;

    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(T value) {
        return (double)value<=maxValue.doubleValue();
    }

    @Override
    public String errorMessage() {
        return "The number exceeds the allowed maximum";
    }


}
