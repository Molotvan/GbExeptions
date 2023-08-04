public class WrongSexException extends RuntimeException {
    private String message = "Неверно введён пол";

    public String getMessage() {
        return this.message;
    }
}
