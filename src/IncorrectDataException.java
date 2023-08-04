import java.text.ParseException;

public class IncorrectDataException extends RuntimeException {

    private String message = "Вы неверно ввели дату";

    public String getMessage() {
        return this.message;
    }
}