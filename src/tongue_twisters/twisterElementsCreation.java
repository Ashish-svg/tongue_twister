package tongue_twisters;
import java.*;
import java.util.*;
public class twisterElementsCreation {
    private int index = 0;
    private static int count = 0;
    private String title;
    private String twister;
    private int length;
    private int difficulty;
    private String icon_url;
    private String hint;

    twisterElementsCreation() {
        this.index = count;
        this.title = "";
        this.twister = "";
        this.length = 0;
        this.difficulty = 1;
        this.icon_url = "";
        this.hint = "";
        count++;
    }
    void show()
    {
        System.out.println("\n{\n\"index\":" + this.index + ",");
        System.out.println("\"title\": \"" + this.title+ "\",");
        System.out.println("\"twister\": \"" + this.twister+ "\",");
        System.out.println("\"length\":" + this.length+ ",");
        System.out.println("\"difficulty\":" + this.difficulty+ ",");
        System.out.println("\"icon_url\": \"" + this.icon_url + "\",");
        System.out.println("\"hint\": \"" + this.hint+"\"");
        System.out.print("}");

    }
    public static void main(String[] args) {
        twisterElementsCreation obj[] = new twisterElementsCreation[1000];
        for (int i = 0; i < 1000; i++) {
            obj[i] = new twisterElementsCreation();
        }
        System.out.println("\"tongue_twisters\":[");
        for(int i=0;i<1000;i++)
        {
            obj[i].show();
            if(i<999)
            {
                System.out.print(",");
            }
            else
            {
                System.out.println("\n]");
            }
        }
    }

}







