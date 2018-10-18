import java.util.*;
import java.lang.*;

public class main{
    public static void main(String[] args){

        //System.out.format("%x",10);

        Scanner in = new Scanner(System.in);
        int dec;
        String bin = new String();
        String hex = new String();

        System.out.print("Enter decimal value\n> ");
        dec = in.nextInt();

        bin = converter.decToBin(dec);
        System.out.println("Binary: "+bin);
        hex = converter.decToHex(dec);
        System.out.println("Hexadecimal: "+hex);


        System.out.print("\nEnter binary value\n> ");
        bin = in.next();

        dec = converter.binToDec(bin);
        System.out.println("Decimal: "+dec);
        hex = converter.binToHex(bin);
        System.out.println("Hexadecimal: "+hex);


        System.out.print("\nEnter hex value\n> ");
        hex = in.next();

        dec = converter.hexToDec(hex);
        System.out.println("Decimal: "+dec);
        bin = converter.hexToBin(hex);
        System.out.println("Binary: "+bin);
        //System.out.println(hex);
        //System.out.println(String.format("%21X", Long.parseLong("1010",2)));

    }
}
