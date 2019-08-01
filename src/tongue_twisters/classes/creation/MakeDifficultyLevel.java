package tongue_twisters.classes.creation;

public class MakeDifficultyLevel {
    private String title;
    private String expanded_title;
    private String level_tip;
    private int start_index;
    private int end_index;
    private int count;

    MakeDifficultyLevel() {
        this.title = "";
        this.expanded_title = "";
        this.level_tip="";
        this.start_index= 1;
        this.end_index = 60;
        this.count = 47;
    }

    public MakeDifficultyLevel(
             String title,
             String expanded_title,
             String level_tip,
             int  start_index,
             int end_index,
             int count
    ) {
        this.title = title;
        this.expanded_title = expanded_title;
        this.level_tip=level_tip;
        this.start_index= start_index;
        this.end_index = end_index;
        this.count = count;
    }

    String getLevelsJson() {
        return "\n\t\t{" +
                "\n\t\t\t\"title\": \"" + title + "\"," +
                "\n\t\t\t\"expanded_title\": \"" + expanded_title + "\"," +
                "\n\t\t\t\"level_tip\": \"" + level_tip + "\"," +
                "\n\t\t\t\"start_index\": " + start_index + "," +
                "\n\t\t\t\"end_index\": " + end_index + "," +
                "\n\t\t\t\"count\": \"" + count +
                "\n\t\t}";
    }
}
