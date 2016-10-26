import java.io.*;
public class ByteInteger{

public static void main(String[] args)
{
    int a = 123;
    byte[] aBytes = intToByteArray(a);
    int a2 = byteArrayToInt(aBytes);

    System.out.println(a);         // prints '123'
    /* make no sense to print out byte, it seems a address of memory */
    System.out.println(aBytes);    // prints '[B@15db9742'
    System.out.println(a2);        // prints '2063597568
    /* make no sense to print out byte, it seems a address of memory */
    System.out.println(intToByteArray(a2));  // prints '[B@6d06d69c'
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

}
