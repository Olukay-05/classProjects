package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

    public static void main(String[] args) {

//        validation();
        boolean isValid = isValidEmail("o.olukayode@semicolon.africa");
        System.out.println(isValid);

    }

    private static void validation() {
        String email = "o.olukayode@semicolon.africa";

        if (isValidEmailAddress(email))
            System.out.println("email address is valid");
        else
            System.out.println("email is invalid");
    }

    public static boolean isValidEmailAddress(String email){

        boolean isValid = email.matches("[a-z].[a-z]+@semicolon.africa");

        return isValid;
    }

    public static boolean isValidEmail(String email){

        Pattern pattern = Pattern.compile("[a-z].[a-z]+@semicolon.africa");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


}
