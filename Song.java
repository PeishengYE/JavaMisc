import java.io.*;
import java.util.*;
public class Song{
    ArrayList<String> songList = new ArrayList<String>(); 
    int bpm;
    String title;


    public static void main(String[] argc)
    {
        Song s = new Song();
        s.getData();
        System.out.println("hello");

    }

    /* read song.txt, get token, put in the array list */
    public void getData(){


        try{

        File file = new File("song.txt");
        BufferedReader reader = new BufferedReader( new FileReader(file));

        String line = null;
        while ((line = reader.readLine()) != null)
            addLine(line);


        }catch (Exception ex){
            ex.printStackTrace();

        }

        

    }

    public void addLine(String lineToParse){

        System.out.println(lineToParse);
        

    }

}
