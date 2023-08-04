public class WrongDataNumberException extends Exception {
    private String message = "Вы ввели неверное количество данных";

    public String getMessage() {
        return this.message;
    }
}
