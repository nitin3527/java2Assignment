import java.util.Scanner;

public class Q8_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        do{
            if(str.charAt(0) == str.charAt(str.length()-1)){
                System.out.println("first and last character matches");
            }
            else {
                System.out.println("first and last does not character matches");
            }
            str = sc.next();
        }while (!str.equals("done"));
    }
}
