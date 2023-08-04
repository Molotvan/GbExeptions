import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int dataNumber = 6;


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.nextLine();
        String[] data = input(userData);
        if (isCorrect(data)) {
            try {
                FileWriter writer = new FileWriter(data[0], true);
                writer.write(userData + "\n");
                writer.flush();
            } catch (IOException r) {
                System.out.println(r.getMessage());
            }
        }
    }


    public static String[] input(String data) throws Exception {
        String[] userData = data.split(" ");
        if (userData.length != dataNumber) {
            throw new WrongDataNumberException();
        }
        return userData;
    }

    public static boolean isCorrect(String[] data) {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yy");
        try {
            format.parse(data[3]);
            Long.parseLong(data[4]);
            Sex sex = Sex.valueOf(data[5]);
        } catch (ParseException e) {
            throw new IncorrectDataException();
        } catch (NumberFormatException e) {
            throw new WrongPhoneException();
        } catch (IllegalArgumentException e) {
            throw new WrongSexException();
        }

        return true;
    }


}