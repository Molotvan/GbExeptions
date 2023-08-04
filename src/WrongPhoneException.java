public class WrongPhoneException extends RuntimeException {
    private String message = "Неверно введён номер телефона";

    public String getMessage() {
        return this.message;
    }
}
