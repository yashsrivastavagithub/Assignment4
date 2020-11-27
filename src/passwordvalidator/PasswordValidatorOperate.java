/*
yashsrivastava
991504142
 */
package passwordvalidator;

/**
 *
 * @author yashk
 */
import java.util.Scanner;

public class PasswordValidatorOperate {

   public static void main(String[] args) {
       String password = "";
     
       Scanner sc = new Scanner(System.in);
      
       System.out.print("Enter password ");
       password = sc.next();
       PasswordValidator pv = new PasswordValidator(password);
       while (true) {

           if (pv.isValidPassword()) {
               System.out.println("Valid");
               break;
           } else {
               System.out.println("Invalid");
           }
           // Getting the input entered by the user
           System.out.print("Enter password ");
           password = sc.next();

           pv.setPassword(password);
       }

   }

}