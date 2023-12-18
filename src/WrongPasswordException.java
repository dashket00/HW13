public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("Wrong login exception");
    }
    public WrongPasswordException(String massage){
        super(massage);
    }
}
