package pojos.US10;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)


    public class User {


        private Integer ID;

        private String StartDateTime;

        private String EndDateTime;

        private String Status;



        public User(Integer ID, String StartDateTime, String EndDateTime, String Status) {
            this.ID = ID;

            this.StartDateTime = StartDateTime;

            this.EndDateTime = EndDateTime;

            this.Status = Status;


        }

        public Integer getID() {
            return ID;

        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public String getStartDateTime() {
            return StartDateTime;
        }

        public void setStartDateTime(String startDateTime) {
            StartDateTime = startDateTime;
        }

        public String getEndDateTime() {
            return EndDateTime;
        }

        public void setEndDateTime(String endDateTime) {
            EndDateTime = endDateTime;
        }

        public String getStatus() {
            return Status;
        }


        @Override
        public String toString() {
            return "User{" +
                    "ID=" + ID +
                    ", StartDateTime='" + StartDateTime + '\'' +
                    ", EndDateTime='" + EndDateTime + '\'' +
                    ", Status='" + Status + '\'' +

                    '}';


        }
    }
