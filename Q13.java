class MyCustomException extends Exception{
    public MyCustomException(String msg){
        super(msg);
    }
}
class callException {
    public void throwException(int i) throws MyCustomException
    {
        if(i == 2){
            System.out.println("exception thrown 2");
            throw new MyCustomException("exception thrown");
        }else {
            System.out.println("thank you");
        }
    }
}
public class Q13 {
    public static void main(String[] args) {
        callException cl = new callException();
        try{
            cl.throwException(2);
        }catch (MyCustomException e){
            System.out.println("exception handled" + e);
        }
    }
}
