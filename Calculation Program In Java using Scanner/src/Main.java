import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("\t\tCalculation Program\n");
        Scanner sc= new Scanner(System.in);
        int z= sc.nextInt();
        int y= sc.nextInt();
        int add=z+y, sub=z-y, mul=z*y, div=z/y, mod=z%y;
        System.out.print("Addition between Two Numbers - ");
        System.out.println(add);
        System.out.print("Substraction between Two Numbers - ");
        System.out.println(sub);
        System.out.print("Multiplication between Two Numbers - ");
        System.out.println(mul);
        System.out.print("Division between Two Numbers - ");
        System.out.println(div);
        System.out.print("Modulus between Two Numbers - ");
        System.out.println(mod);
    }
}