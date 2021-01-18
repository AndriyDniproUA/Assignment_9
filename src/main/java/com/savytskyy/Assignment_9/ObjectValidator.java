package main.java.com.savytskyy.Assignment_9;

public interface ObjectValidator <T>{
    void validate (T o) throws ValidationException;
}
