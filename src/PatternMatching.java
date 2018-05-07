import java.util.Scanner;
import java.util.regex.*;

public class PatternMatching {
    public static void main(String args[]){
        System.out.println("Enter Your Email ID");
        Scanner in=new Scanner(System.in);
        String email=in.nextLine();

        String emailPattern="^[_a-zA-z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+(\\.[a-zA-Z]{2,6})?$";
        Pattern compile=Pattern.compile(emailPattern);
        Matcher matcher=compile.matcher(email);
        if(!matcher.matches()){
            System.out.println("Entered EMAIL is not valid\nPlease Enter a valid Email");
        }
        else {
            System.out.println("This is a valid EMAIL type, you can proceed further");
        }

    }
}
