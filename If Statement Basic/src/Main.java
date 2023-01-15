import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age>21)
        {
            System.out.println("Eligible to Marry");
        }else{
            System.out.println("Illegal to Marry");
        }
    }
}