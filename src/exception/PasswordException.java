
package exception;

public class PasswordException extends Exception{
    public String message(){
        return "Password minimal 8 - 16 karakter terdiri dari huruf besar, huruf kecil, angka, dan tanda unik!";
    }
}
