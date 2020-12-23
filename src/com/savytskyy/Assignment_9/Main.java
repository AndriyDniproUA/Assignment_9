package com.savytskyy.Assignment_9;

import com.savytskyy.Assignment_9.ValidationRules.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
//        String phone = "+380676370713";
//
//        List<ValidatorRule> rules = new ArrayList<>();
//        rules.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
//        rules.add(new StartsWithValidatorRule("+38"));
//        ObjectValidator<String> validator = new RulesBasedObjectValidator(rules);
//        try {
//            validator.validate(phone);
//
//
//        } catch (ValidationException e) {
//            System.out.println("Wrong number " + e.getMessage());
//        }
        double num = -1;

        List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new MaxNumberValidatorRule(10));
        rules.add(new MinNumberValidatorRule(0));

        ObjectValidator<Number> validator = new RulesBasedObjectValidator(rules);
        try {
            validator.validate(num);

        } catch (ValidationException e) {
            System.out.println("Invalid value: "+ e.getMessage());

        }
    }
}
