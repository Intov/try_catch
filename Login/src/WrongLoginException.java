public class WrongLoginException extends Exception{
    String Message;
    public WrongLoginException() {
        Message = "Password " + false;
    }

    public WrongLoginException(String Message){
        super(Message);
        this.Message = Message;
    }

}
