import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int dataNumber = 6;
    public enum Sex {
        m, f;

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.nextLine();
        String[] data = input(userData);
        if(isCorrect(data)){
            try{
                FileWriter writer = new FileWriter(data[0], true);
                writer.write(userData + "\n");
                writer.flush();
            }catch (Exception r){System.out.println(r.getMessage());}
            }
        }





    public static String[] input(String data)throws Exception{
        String[] userData = data.split(" ");
        if(userData.length != dataNumber){
            throw new Exception("Вы ввели неверное количество параметров, попробуйте ещё раз");
        }
        return userData;
    }

    public static boolean isCorrect(String[] data){
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yy");
        try {format.parse(data[3]);
            Long.parseLong(data[4]);
            Sex sex = Sex.valueOf(data[5]);
        }catch (java.text.ParseException e){
            System.out.println("Неверный формат даты");
            return false;
        }catch (NumberFormatException e){
            System.out.println("Неверно введён номер телефона");
            return false;
        }catch (IllegalArgumentException e){
            System.out.println("Пол введён неверно");
            return false;
        }

        return true;
    }


}