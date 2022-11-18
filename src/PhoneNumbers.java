import java.util.regex.Pattern;

public class PhoneNumbers {
    public static String checkingCorrect(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\D");
        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");
        if (Pattern.matches("^7[0-9]{10}$", phoneNumber)) {
            //  System.out.println(phoneNumber);
        } else if (Pattern.matches("^8[0-9]{10}$", phoneNumber)) {
            //   System.out.println("7" + phoneNumber.substring(1));
        } else if (Pattern.matches("^[0-9]{10}$", phoneNumber)) {
            //    System.out.println("7" + phoneNumber);
        } else {
            System.out.println("Неверный формат номера!");
        }
        return phoneNumber;
    }
}
