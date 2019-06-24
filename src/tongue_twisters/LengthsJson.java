package tongue_twisters;

public class LengthsJson {
        private String title;
        private String expanded_title;
        private String level_tip;
        private int[] indices= new int[200];
        LengthsJson() {

            this.title = "";
            this.expanded_title = "";
            this.level_tip="";
            for(int i=0;i<200;i++)
            {
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
            String str= "\n\t\t{" +
                    "\n\t\t\t\"title\": \"" + title + "\"," +
                    "\n\t\t\t\"expanded_title\": \"" + expanded_title + "\"," +
                    "\n\t\t\t\"level_tip\": \"" + level_tip + "\"," +
                    "\n\t\t\t\"indices\": [\n\t";
                    for(int i=0;i<200;i++)
                    {
                        str+= (indices[i]+",\t");
                    }
                    str+="]\n\t\t}";
                    return str;
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
