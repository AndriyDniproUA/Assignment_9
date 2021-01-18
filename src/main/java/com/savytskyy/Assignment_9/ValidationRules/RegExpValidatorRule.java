package main.java.com.savytskyy.Assignment_9.ValidationRules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule<T> implements ValidatorRule<T> {
    Pattern pattern;

    public RegExpValidatorRule(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean validate(T value) {
        Matcher matcher = pattern.matcher((String)value);
        return matcher.matches();
    }

    @Override
    public String errorMessage() {
        return "The String doesn't match the pattern";
    }
}
