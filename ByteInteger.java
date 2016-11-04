import java.io.*;
public class ByteInteger{

public static void main(String[] args)
{
    int a = 123;
    byte[] aBytes = intToByteArray(a);
    int a2 = byteArrayToInt(aBytes);

    //System.out.println(a);         // prints '123'
    /* make no sense to print out byte, it's HASH code of the bytes' */
    //System.out.println(aBytes);    // prints '[B@15db9742'

    //System.out.println(a2);        // prints '2063597568
    /* make no sense to print out byte, it's HASH code of the bytes */
    //System.out.println(intToByteArray(a2));  // prints '[B@6d06d69c'
    //byte[] input = {0x14, 0x11,0x10,0x20 };
    byte[] input = {(byte)0xd1, 0x1e, 0x0, 0x0 };
    long ret = bytesToUnsigedLong(input);
    System.out.println(ret);        // prints '2063597568

    int integerOutput = byteArrayToInt(input); 
    System.out.println("integerOutput: " + integerOutput);        // prints '2063597568

    byte original = (byte)0xff;
    System.out.println("original: " + original);        // prints -1

    long originalLong = original;
    System.out.println("originalLong: " + originalLong);        // prints -1

    originalLong = original&0xff;
    System.out.println("originalLong: " + originalLong);        // prints 255


}

public static int byteArrayToInt(byte[] b) 
{
    int value = 0;
    for (int i = 0; i < 4; i++) {
        int shift = (4 - 1 - i) * 8;
        value += (b[i] & 0x000000FF) << shift;
    }
    return value;
}

public static byte[] intToByteArray(int a)
{
    byte[] ret = new byte[4];
    ret[3] = (byte) (a & 0xFF);   
    ret[2] = (byte) ((a >> 8) & 0xFF);   
    ret[1] = (byte) ((a >> 16) & 0xFF);   
    ret[0] = (byte) ((a >> 24) & 0xFF);
    return ret;
}

public static long bytesToUnsigedLong(byte[] input)
{
    //long byte1 = input[0] & 0xff;
    long byte1 = input[0]&0xff;
    long byte2 = input[1]&0xff;
    long byte3 = input[2]&0xff;
    long byte4 = input[3]&0xff;
    //long output = (byte4 << 24)| (byte3 << 16)|(byte2 << 8)| input[0];
    long output = (byte4 << 24)| (byte3 << 16)|(byte2 << 8)| byte1;
    return output;
}


}
