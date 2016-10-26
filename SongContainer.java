import java.io.*;
import java.util.*;
public class SongContainer{

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args){
         new SongContainer().go();

    }

    public void go(){
        getSongs();
      System.out.println(songList);
      Collections.sort(songList);
      System.out.println(songList);

    }

    public void getSongs(){

        String line = null;
        try{
            File file = new File("songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null){

                String[] tokens = line.split("/");
                songList.add(tokens[0]);
            }


        }catch(Exception ex){

            ex.printStackTrace();
        }

    }

}
