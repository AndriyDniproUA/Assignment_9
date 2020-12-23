package com.savytskyy.Assignment_9.ValidationRules;

public interface ValidatorRule <T>{
    boolean validate (T value);
    String errorMessage();
}
