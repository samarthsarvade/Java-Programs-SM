import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("\t\tCalculation Program\n");
        int z=27;
        int y=9;
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