package tongue_twisters.classes.creation;

import tongue_twisters.classes.TwisterJson;
import tongue_twisters.classes.others.Constants;

import java.util.ArrayList;
import java.util.List;

public class MakeTwisters {

    static final int COUNT_TWISTERS = 471;
    static final int NUM_LEVELS_BY_LENGTH = 3;
    private static final int NUM_LEVELS_BY_DIFFICULTY = 10;

    private static int LENGTH_BATCH_SIZE, DIFFICULTY_BATCH_SIZE;

    @SuppressWarnings("FieldCanBeLocal")
    private static int levelStepCount;
    private static final String END_JSON = "\n\t]\n}";
    private static final String START_JSON_TWISTERS = "{\n\t\"tongue_twisters\": [";

    private static List<String> lengthLevelNames = Constants.lengthLevelNames;
    private static List<String> difficultyLevelNames = Constants.difficultyLevelNames;

    public static void main(String[] args) {

        computeLengthBatchSize();
        computeDifficultyBatchSize();

        List<String> sortedTwistersList = new MakeTwistersSort().getSortedTwistersList();

        List<TwisterJson> twisterList = new ArrayList<>();
        List<MakeDifficultyLevel>  difficultyList = new ArrayList<>();
        List<MakeLengthLevel> lengthsList = new ArrayList<>();

        for (int index = 1; index <= COUNT_TWISTERS; index++)
            twisterList.add(index-1, new TwisterJson(
                    index,
                    sortedTwistersList.get(index - 1),
                    getLengthLevelForIndex(index),
                    getDifficultyLevelForIndex(index),
                    getIsLockedForIndex(index)
            ));

        levelStepCount = 0;
        for (int index = 0; index < NUM_LEVELS_BY_LENGTH; index++) {
            System.out.println(lengthLevelNames.get(index));
            lengthsList.add(index, new MakeLengthLevel(
                    lengthLevelNames.get(index),
                    "",
                    "",
                    LENGTH_BATCH_SIZE * levelStepCount + 1,
                    LENGTH_BATCH_SIZE * (levelStepCount + 1),
                    LENGTH_BATCH_SIZE
            ));
            levelStepCount++;
        }

        levelStepCount = 0;
        for (int index = 0; index < NUM_LEVELS_BY_DIFFICULTY; index++) {
            difficultyList.add(index, new MakeDifficultyLevel(
                    difficultyLevelNames.get(index),
                    "",
                    "",
                    DIFFICULTY_BATCH_SIZE * levelStepCount + 1,
                    DIFFICULTY_BATCH_SIZE * (levelStepCount + 1),
                    DIFFICULTY_BATCH_SIZE
            ));
            levelStepCount++;
        }

        System.out.println(getBuilderString(twisterList));
        System.out.println(getLevelsBuilderString(difficultyList));
        System.out.println(getLengthsBuilderString(lengthsList));
    }

    private static boolean getIsLockedForIndex(int index) {
        return (index % DIFFICULTY_BATCH_SIZE) > 6;
    }

    private static int getLengthLevelForIndex(int index) {
        return (index / LENGTH_BATCH_SIZE) + 1;
    }

    private static int getDifficultyLevelForIndex(int index) {
        return (index / DIFFICULTY_BATCH_SIZE) + 1;
    }

    private static void computeLengthBatchSize() {
        LENGTH_BATCH_SIZE = COUNT_TWISTERS / NUM_LEVELS_BY_LENGTH;
    }

    private static void computeDifficultyBatchSize() {
        DIFFICULTY_BATCH_SIZE = COUNT_TWISTERS / NUM_LEVELS_BY_DIFFICULTY;
    }

    private static String getBuilderString(List<TwisterJson> twisterList) {
        StringBuilder builder = new StringBuilder(START_JSON_TWISTERS);

        for(TwisterJson twisterJson: twisterList)
            builder.append(twisterJson.getTwisterJson()).append(",");

        builder.append(END_JSON);
        return builder.toString();
    }

    private static String getLevelsBuilderString(List<MakeDifficultyLevel> levelsList) {
        StringBuilder levelBuilder = new StringBuilder("{\n\t\"levels\": [");
        for(MakeDifficultyLevel makeDifficultyLevel : levelsList)
            levelBuilder.append(makeDifficultyLevel.getLevelsJson()).append(",");

        levelBuilder.append( "\n\t]\n}");
        return levelBuilder.toString();
    }

    private static String getLengthsBuilderString(List<MakeLengthLevel> lengthsList) {
        StringBuilder lengthBuilder = new StringBuilder("{\n\t\"lengths\": [");
        for(MakeLengthLevel makeLengthLevel : lengthsList)
            lengthBuilder.append(makeLengthLevel.getLengthsJson()).append(",");

        lengthBuilder.append( "\n\t]\n}");
        return lengthBuilder.toString();
    }
}







