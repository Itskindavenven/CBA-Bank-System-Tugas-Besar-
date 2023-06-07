package exception;

public class InvalidInputanKosongException extends Exception{
    public String message(){
        return "Field input tidak boleh kosong!";
    }
}
