
package exception;
public class UsernameException extends Exception{
    public String message(){
        return "Username minimal 8 - 16 karakter!";
    }
}
