package tongue_twisters;

public class LevelsJson {
    private String title;
    private String expanded_title;
    private String level_tip;
    private int start_index;
    private int end_index;

    LevelsJson() {

        this.title = "";
        this.expanded_title = "";
        this.level_tip="";
        this.start_index= 1;
        this.end_index = 60;
    }

    public LevelsJson(
             String title,
             String expanded_title,
             String level_tip,
             int  start_index ,
             int end_index
    ) {
        this.title = title;
        this.expanded_title = expanded_title;
        this.level_tip=level_tip;
        this.start_index= 1;
        this.end_index = 60;
    }

    String getLevelsJson() {
        return "\n\t\t{" +
                "\n\t\t\t\"title\": \"" + title + "\"," +
                "\n\t\t\t\"expanded_title\": \"" + expanded_title + "\"," +
                "\n\t\t\t\"level_tip\": \"" + level_tip + "\"," +
                "\n\t\t\t\"start_index\": " + start_index + "," +
                "\n\t\t\t\"end_index\": \"" + end_index + "," +
                "\n\t\t}";
    }

    public int getStart_index() {
        return start_index;
    }

    public void setStart_index(int index) {
        this.start_index = start_index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExpanded_title() {
        return expanded_title;
    }

    public void setExpanded_title(String twister) {
        this.expanded_title = expanded_title;
    }

    public int getEnd_index() {
        return end_index;
    }

    public void setEnd_index(int end_index) {
        this.end_index = end_index;
    }

    public String getLevel_tip() {
        return level_tip;
    }

    public void setLevel_tip(String level_tip) {
        this.level_tip = level_tip;
    }
}
