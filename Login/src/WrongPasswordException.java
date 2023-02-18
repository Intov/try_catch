public class WrongPasswordException extends Exception{
    String Message;
    public WrongPasswordException(){
        Message = "Login " + false;
    }
    public WrongPasswordException(String Message){
        super(Message);
        this.Message = Message;
    }
}
