package tongue_twisters.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static tongue_twisters.classes.Constants.robinMacProjectLocation;

public class SortedTwisters {

    private static int index = 0;
    private static List<String> sortedTwisters = new ArrayList<>();

    private static BufferedReader bufferedReader;

    //TODO: toggle as required
    private static boolean isPrintEnabled = false;

    SortedTwisters() { main(null); }

    public static void main(String[] args)  {

        initVariables();
        addTwistersToList();
        sortTwisters();
        printAllTwisters();
        printTwistersCount();
    }

    private static void sortTwisters() {
        for(int i=0;i<sortedTwisters.size();i++) {
            for (int j = i + 1; j < sortedTwisters.size(); j++) {
                if (sortedTwisters.get(i).length() > sortedTwisters.get(j).length()) {
                    String temp = sortedTwisters.get(i);
                    sortedTwisters.set(i,sortedTwisters.get(j));
                    sortedTwisters.set(j,temp);
                }
            }
        }
    }

    private static void addTwistersToList() {
        try {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                if(line.length() > 0)
                    sortedTwisters.add(index, Utils.getFormattedStringForLine(line));
                else
                    index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void initVariables() {
        try {
            FileReader fileReader = new FileReader(robinMacProjectLocation);
            bufferedReader = new BufferedReader(fileReader);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    List<String> getSortedTwistersList() {
        return sortedTwisters;
    }

    private static void printAllTwisters() {
        if(isPrintEnabled)
            for(String temp: sortedTwisters)
                System.out.println(temp);
    }

    private static void printTwistersCount() {
        if(isPrintEnabled)
            System.out.println(
                    String.format("\n\nTotal number of twisters is %d", sortedTwisters.size())
            );
    }
}
