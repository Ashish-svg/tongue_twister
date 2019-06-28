package tongue_twisters.classes;

import java.util.ArrayList;
import java.util.List;

public class TwisterElementsCreation {

    private static final int COUNT_TWISTERS = 600;
    private static final int NUM_LEVELS_BY_LENGTH = 3;
    private static final int NUM_LEVELS_BY_DIFFICULTY = 10;

    private static final String END_JSON = "\n\t]\n}";
    private static final String START_JSON_TWISTERS = "{\n\t\"tongue_twisters\": [";

    public static void main(String[] args) {
        List<TwisterJson> twisterList = new ArrayList<>();
        List<LevelsJson>  levelsList = new ArrayList<>();
        List<LengthsJson> lengthsList = new ArrayList<>();

        for (int index = 1; index <= COUNT_TWISTERS; index++)
            twisterList.add(index-1, new TwisterJson(index));

        for (int index = 1; index <= NUM_LEVELS_BY_DIFFICULTY; index++)
            levelsList.add(index-1, new LevelsJson());

        for (int index = 1; index <= NUM_LEVELS_BY_LENGTH; index++)
            lengthsList.add(index-1, new LengthsJson());

        System.out.println(getBuilderString(twisterList));
        System.out.println(getLevelsBuilderString(levelsList));
        System.out.println(getLengthsBuilderString(lengthsList));
    }

    private static String getBuilderString(List<TwisterJson> twisterList) {
        StringBuilder builder = new StringBuilder(START_JSON_TWISTERS);

        for(TwisterJson twisterJson: twisterList)
            builder.append(twisterJson.getTwisterJson()).append(",");

        builder.append(END_JSON);
        return builder.toString();
    }

    private static String getLevelsBuilderString(List<LevelsJson> levelsList) {
        StringBuilder levelBuilder = new StringBuilder("{\n\t\"levels\": [");
        for(LevelsJson levelsJson: levelsList)
            levelBuilder.append(levelsJson.getLevelsJson()).append(",");

        levelBuilder.append( "\n\t]\n}");
        return levelBuilder.toString();
    }

    private static String getLengthsBuilderString(List<LengthsJson> lengthsList) {
        StringBuilder lengthBuilder = new StringBuilder("{\n\t\"lengths\": [");
        for(LengthsJson lengthsJson: lengthsList)
            lengthBuilder.append(lengthsJson.getLengthsJson()).append(",");

        lengthBuilder.append( "\n\t]\n}");
        return lengthBuilder.toString();

    }
}







