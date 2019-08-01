package tongue_twisters.classes.creation;

import static tongue_twisters.classes.creation.MakeTwisters.COUNT_TWISTERS;
import static tongue_twisters.classes.creation.MakeTwisters.NUM_LEVELS_BY_LENGTH;

public class MakeLengthLevel {

    private static final int COUNT_TWISTERS_PER_LEVEL_LENGTH = COUNT_TWISTERS / NUM_LEVELS_BY_LENGTH;

    private String title;
    private String expanded_title;
    private String level_tip;
    private int start_index;
    private int end_index;
    private int count;

    MakeLengthLevel() {
        this.title = "";
        this.expanded_title = "";
        this.level_tip = "";
        this.start_index= 1;
        this.end_index = 157;
        this.count = 157;
    }

    public MakeLengthLevel(
            String title,
            String expanded_title,
            String level_tip,
            int  start_index,
            int end_index,
            int count
    ) {
        this.title = title;
        this.expanded_title = expanded_title;
        this.level_tip = level_tip;
        this.start_index= start_index;
        this.end_index = end_index;
        this.count = count;
    }

    String getLengthsJson() {

        return "\n\t\t{" + "\n\t\t\t\"title\": \"" + title + "\"," +
                "\n\t\t\t\"expanded_title\": \"" + expanded_title + "\"," +
                "\n\t\t\t\"level_tip\": \"" + level_tip + "\"," +
                "\n\t\t\t\"start_index\": " + start_index + "," +
                "\n\t\t\t\"end_index\": " + end_index + "," +
                "\n\t\t\t\"count\": " + count +
                "\n\t\t}";
    }
}
