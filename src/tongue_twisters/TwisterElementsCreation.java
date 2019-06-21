package tongue_twisters;

import java.util.ArrayList;
import java.util.List;

public class TwisterElementsCreation {

    private static final String START_JSON_TWISTERS = "{\n\t\"tongue_twisters\": [";
    private static final String END_JSON = "\n\t]\n}";
    private static final int COUNT_TWISTERS = 600;

    public static void main(String[] args) {
        List<TwisterJson> twisterList = new ArrayList<TwisterJson>();

        for (int index = 1; index <= COUNT_TWISTERS; index++)
            twisterList.add(index-1, new TwisterJson(index));

        System.out.println(getBuilderString(twisterList));
    }

    private static String getBuilderString(List<TwisterJson> twisterList) {
        StringBuilder builder = new StringBuilder(START_JSON_TWISTERS);

        for(TwisterJson twisterJson: twisterList)
            builder.append(twisterJson.getTwisterJson()).append(",");

        builder.append(END_JSON);
        return builder.toString();
    }
}







