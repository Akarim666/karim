package org.exemple;

public class RegistrattionUtil {
    boolean validateUserInput(String username,String passWord, String confirmPassword){
        if(username.isEmpty()|| passWord.isEmpty()|| confirmPassword.isEmpty()){
            return false;
        }
        if (!passWord.equals(confirmPassword)){
            return false;
        } else {
            return  true;
        }
    }
}
