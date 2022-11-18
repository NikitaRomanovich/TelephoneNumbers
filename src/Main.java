import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listTelephoneNumber = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер телефона!");
            String input = scanner.nextLine();
            if (input.equals("0"))  {
                scanner.close();
                break;
            }

            listTelephoneNumber.add(PhoneNumbers.checkingCorrect(input));
            listTelephoneNumber.forEach(System.out::println);
        }
    }
}