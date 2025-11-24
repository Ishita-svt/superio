package util;

public class Validation {

    public static boolean isEmpty(String value) {
        if(value == null || value.trim().equals("")) {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String email) {
        // VERY BASIC check
        if(email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }
}
