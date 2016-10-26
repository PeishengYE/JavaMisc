import java.io.*;
import java.util.*;

public class SongsContainer{

    ArrayList<String> songsList = new ArrayList<String>();
    public static void main(String[] args){
         new SongsContainer().go();
    }


    public void go(){
        getSongs();
        System.out.println(songsList);
    }

    public void getSongs(){

        String line = null;
        String [] tokens = null;
        try{
            File file = new File("songs.txt");
            BufferedReader reader = new BufferedReader (new FileReader(file));

            while ((line = reader.readLine()) != null){

                tokens = line.split("/");
                songsList.add(tokens[0]);
            }


        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
