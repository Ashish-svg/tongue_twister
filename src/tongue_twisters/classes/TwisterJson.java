package tongue_twisters.classes;

@SuppressWarnings("unused")
public class TwisterJson {

    private int index = 0;
    private boolean isLocked;
    private String title;
    private String twister;
    private int length;
    private int difficulty;
    private String icon_url;
    private String hint;

    TwisterJson(int index, String twister, int length, int difficulty, boolean isLocked) {
        this.index = index;
        this.title = "";
        this.twister = twister;
        this.length = length;
        this.difficulty = difficulty;
        this.icon_url = "";
        this.hint = "";
        this.isLocked = isLocked;
    }

    public TwisterJson(
            int index,
            String title,
            String twister,
            int length,
            int difficulty,
            String icon_url,
            String hint,
            boolean isLocked
    ) {
        this.index = index;
        this.title = title;
        this.isLocked = isLocked;
        this.twister = twister;
        this.length = length;
        this.difficulty = difficulty;
        this.icon_url = icon_url;
        this.hint = hint;
    }

    String getTwisterJson() {
        return "\n\t\t{" +
                "\n\t\t\t\"index\": " + index + "," +
                "\n\t\t\t\"title\": \"" + title + "\"," +
                "\n\t\t\t\"twister\": \"" + twister + "\"," +
                "\n\t\t\t\"length\": " + length + "," +
                "\n\t\t\t\"difficulty\": " + difficulty + "," +
                "\n\t\t\t\"icon_url\": \"" + icon_url + "\"," +
                "\n\t\t\t\"hint\": \"" + hint + "\"," +
                "\n\t\t\t\"is_locked\": " + isLocked +
                "\n\t\t}";
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTwister() {
        return twister;
    }

    public void setTwister(String twister) {
        this.twister = twister;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
