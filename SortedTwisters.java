package tongue_twisters;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedTwisters {
    public static void main(String[] args)  {
        int ch,index=0;
        String line= new String();
        List<String> sortedTwisters= new ArrayList<String>();
        int []sorting= new int[500];
        BufferedReader br= null;;
        try
        {
            FileReader fr= new FileReader("C:\\Users\\ashis\\IdeaProjects\\ProjectTongueTwister\\src\\tongue_twisters\\TongueTwistersRaw.txt");
            br=new BufferedReader(fr);
            while((line = br.readLine())!=null)
            {
                if(line.length()>0)
                {
                    line=line.replaceAll("\'","\\\\"+"\'");
                    line=line.replaceAll("\"","\\\\"+"\"");
                    sortedTwisters.add(index,line);
                }
                else if(line.length()==0)
                {
                    index++;
                }
            }
            for(int i=0;i<sortedTwisters.size();i++) {
                for (int j = i + 1; j < sortedTwisters.size(); j++) {
                    if (sortedTwisters.get(i).length() > sortedTwisters.get(j).length()) {
                        String temp = sortedTwisters.get(i);
                        sortedTwisters.set(i,sortedTwisters.get(j));
                        sortedTwisters.set(j,temp);

                    }
                }
            }
            for( String temp: sortedTwisters)
            {
                System.out.println(temp);
            }
            System.out.println(sortedTwisters.size());




        }
        catch (Exception e)
        {
            System.out.println("file not found");
        }

    }
}
