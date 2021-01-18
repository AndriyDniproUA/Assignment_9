package main.java.com.savytskyy.Assignment_9;

import main.java.com.savytskyy.Assignment_9.ValidationRules.ValidatorRule;

import java.util.ArrayList;
import java.util.List;

public class RulesBasedObjectValidator <T> implements ObjectValidator <T> {
    List<ValidatorRule<T>> rules;

    public RulesBasedObjectValidator(List<ValidatorRule<T>> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(T o) throws ValidationException {
        for (int i = 0; i < rules.size(); i++) {
            if (!rules.get(i).validate(o)) throw new ValidationException(rules.get(i).errorMessage());
        }
    }
}
