package tongue_twisters.classes.others;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Constants {

    public static final String ashishWindowsMacProjectLocation =
            "C:\\Users\\ashis\\IdeaProjects\\ProjectTongueTwister\\src\\tongue_twisters\\src\\tongue_twisters\\storage\\raw_twisters.txt";

    public static final String robinMacProjectLocation =
            "/Users/robinkamboj/Desktop/interns/tongue_twister/src/tongue_twisters/storage/raw_twisters.txt";

    public static List<String> lengthLevelNames;
    public static List<String> difficultyLevelNames;

    static {
        lengthLevelNames = new ArrayList<>();
        difficultyLevelNames = new ArrayList<>();

        lengthLevelNames.add("SMALL");
        lengthLevelNames.add("MEDIUM");
        lengthLevelNames.add("LONG");

        difficultyLevelNames.add("Beginner's Luck");
        difficultyLevelNames.add("Lit Up");
        difficultyLevelNames.add("Speeding Up");
        difficultyLevelNames.add("No Seat Belt");
        difficultyLevelNames.add("No Helmet");
        difficultyLevelNames.add("Drunken Drive");
        difficultyLevelNames.add("Brake Fail");
        difficultyLevelNames.add("Steering Wheel");
        difficultyLevelNames.add("Accident Certain");
        difficultyLevelNames.add("Death Certain");
    }
}
