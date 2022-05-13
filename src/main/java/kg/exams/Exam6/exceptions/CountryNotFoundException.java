package kg.exams.Exam6.exceptions;

public class CountryNotFoundException extends RuntimeException{
    public CountryNotFoundException(String s) {
        super(s);
    }
}
