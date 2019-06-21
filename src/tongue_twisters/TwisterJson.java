package tongue_twisters;

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

    TwisterJson(int index) {
        this.index = index;
        this.title = "";
        this.twister = "";
        this.length = 0;
        this.difficulty = 0;
        this.icon_url = "";
        this.hint = "";
        this.isLocked = false;
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
                "\n\t\t\tindex: " + index + "," +
                "\n\t\t\ttitle: \"" + title + "\"," +
                "\n\t\t\ttwister: \"" + twister + "\"," +
                "\n\t\t\tlength: " + length + "," +
                "\n\t\t\tdifficulty: " + difficulty + "," +
                "\n\t\t\ticon_url: \"" + icon_url + "\"," +
                "\n\t\t\thint: \"" + hint + "\"," +
                "\n\t\t\tis_locked: " + isLocked +
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
