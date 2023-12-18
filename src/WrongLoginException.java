public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super("Wrong login exception");
    }
    public WrongLoginException(String massage){
        super(massage);
    }
}
