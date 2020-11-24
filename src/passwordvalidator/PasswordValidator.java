package passwordvalidator;

import java.util.Scanner;

/**
 * A class to validate a user's chosen password. The password must have a length of at least 8 and at least one
 * uppercase character and at least one special character (character that is not a letter or a number). This is also our
 * class under test. Starter code for ICE 4
 *
 * @author Haki Put your name and student is as modified by
 * @date
 */
public class PasswordValidator {

    /**
     * Main method cycles through our static utility methods to determine whether the password is valid or not.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isValid = false;

        do {
            System.out.println("Please enter a VALID password, password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");

            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();

            if (checkLength(password)) {
                isValid = true;
            }

        } while (!isValid);

        System.out.println("Valid password, accepted!");
    }

    public static boolean checkLength(String pass) {
        
        if (pass.length() >= 8) {
            return true;
        }
        return false;
    }
}
