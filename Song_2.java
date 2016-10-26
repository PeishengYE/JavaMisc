import java.io.*;
import java.util.*;

public class SongObject{

    ArrayList<Song> songObjectList = new ArrayList<Song>();

    public void static main(String[] args){
        new SongObject().go();
    }

    public SongObject(){


    }

    public void getSongs(){
        String line = null;

        try{
            File file = new File("songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!= null){
                addLine(line);
            }

        }catch(Exception ex){
            printStackTrace(ex);
        }

    }

    private void addLine(String lineToParse){
        String[] tokens = lineToParse.split("/");
        SongOb

    }

}
