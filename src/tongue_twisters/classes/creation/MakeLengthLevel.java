package tongue_twisters.classes.creation;

import static tongue_twisters.classes.creation.MakeTwisters.COUNT_TWISTERS;
import static tongue_twisters.classes.creation.MakeTwisters.NUM_LEVELS_BY_LENGTH;

public class MakeLengthLevel {

    private static final int COUNT_TWISTERS_PER_LEVEL_LENGTH = COUNT_TWISTERS / NUM_LEVELS_BY_LENGTH;

    private String title;
    private String expanded_title;
    private String level_tip;
    private int[] indices = new int[COUNT_TWISTERS_PER_LEVEL_LENGTH];

    MakeLengthLevel() {
        this.title = "";
        this.expanded_title = "";
        this.level_tip="";

        for(int i = 0; i < COUNT_TWISTERS_PER_LEVEL_LENGTH; i++)
            this.indices[i] = i + 1;
    }

    public MakeLengthLevel(
            String title,
            String expanded_title,
            String level_tip,
            int[] indices
    ) {
        this.title = title;
        this.expanded_title = expanded_title;
        this.level_tip=level_tip;
        this.indices=indices;
    }

    String getLengthsJson() {
        StringBuilder builder = new StringBuilder("\n\t\t{");
        builder.append("\n\t\t\t\"title\": \"").append(title).append("\",")
                .append("\n\t\t\t\"expanded_title\": \"").append(expanded_title).append("\",")
                .append("\n\t\t\t\"level_tip\": \"").append(level_tip).append("\",")
                .append("\n\t\t\t\"indices\": [\n\t");

        for(int i = 0; i< COUNT_TWISTERS_PER_LEVEL_LENGTH; i++)
            builder.append(indices[i]).append(",\t");

        builder.append("\n]\n\t\t}");

        return builder.toString();
    }
}
