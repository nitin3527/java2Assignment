public class Q6 {
    public static void main(String[] args) {
        try{
            int b[] = new int[6];
            int a = 56/0;
            b[9] = 56;
        } catch (ArithmeticException e) {
            System.out.println("This is an arithmetic exception: " + e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("This is an index out of bounds exception: " + e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Exception resolved");
        }
    }
}