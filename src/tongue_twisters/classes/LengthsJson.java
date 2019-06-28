package tongue_twisters.classes;

public class LengthsJson {

    private static final int COUNT_TWISTERS_PER_LEVEL_LENGTH = 200;

        private String title;
        private String expanded_title;
        private String level_tip;
        private int[] indices= new int[COUNT_TWISTERS_PER_LEVEL_LENGTH];

        LengthsJson() {
            this.title = "";
            this.expanded_title = "";
            this.level_tip="";
            for(int i=0;i<200;i++) {
                this.indices[i]=i+1;
            }
        }

        public LengthsJson(
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

        public String getLevel_tip() {
            return level_tip;
        }

        public void setLevel_tip(String level_tip) {
            this.level_tip = level_tip;
        }
}
