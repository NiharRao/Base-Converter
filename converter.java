import java.util.*;
import java.lang.*;

public class converter{

    /*converter methods*/

    /*dec -> bin or hex*/
    public static String decToBin(int dec){
        return Integer.toBinaryString(dec);
    }

    public static String decToHex(int dec){
        return String.format("%X", dec);
    }

    /*bin -> dec or hex*/
    public static int binToDec(String bin){
        return Integer.parseInt(bin,2);
    }

    public static String binToHex(String bin){
        return decToHex(binToDec(bin));
    }

    /*hex -> dec or bin*/
    public static int hexToDec(String hex){
        return Integer.parseInt(hex,16);
    }

    public static String hexToBin(String hex){
        return decToBin(hexToDec(hex));
    }

}
