package tongue_twisters.classes;

class Utils {

    static String getFormattedStringForLine(String line) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if(c == '\"') {
                builder.append("\\\"");
            }
            else if(c == '\'') {
                builder.append("\\\'");
            }
            else if(c == '.' || c == '?' || c == '!') {
                builder.append(c).append("\n");
            }
            else if(i > 0 && c == ' ' && (line.charAt(i-1) == '.' || line.charAt(i-1) == '?' || line.charAt(i-1) == '!')) {
                skipBlock();
            }
            else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    private static void skipBlock() {}
}
