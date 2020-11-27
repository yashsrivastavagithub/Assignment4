package passwordvalidator;

import java.util.Scanner;

/**
/*
yashsrivastava
991504142
 */
 
public class PasswordValidator {
   private String password;

  
   /**
   * @param password
   */
   public PasswordValidator(String password) {
       this.password = password;
   }


   /**
   * @return the password
   */
   public String getPassword() {
       return password;
   }


   /**
   * @param password the password to set
   */
   public void setPassword(String password) {
       this.password = password;
   }


   public boolean isValidPassword() {
       int flag=0;
       if (password.length() >= 8) {
          
           flag=1;
       }

       int upperCnt = 0, specialCnt = 0;
       char ch;
       for (int i = 0; i < password.length(); i++) {
           ch = password.charAt(i);
           if (Character.isUpperCase(ch)) {
               upperCnt++;
           }
           if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
               specialCnt++;
           }
       }
      
       if(flag==0)
       {
           System.out.println(" Password must be 8 characteres ");
       }
if(upperCnt<1)
{
   System.out.println("You need minimum 1 uppercase letter.");
}
if(specialCnt<1)
{
   System.out.println("You need minimum 1 special case character.");
}
       if (upperCnt <1 || specialCnt < 1 || flag==0) {
           return false;
       } else
           return true;
   }
}