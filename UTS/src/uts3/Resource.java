package uts3;

public class Resource{
    String title;
    Boolean borrowed_status;
    String date_borrowed;
    String due_date; 

    public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }

    public Boolean getBorrowed_status() {
        return borrowed_status;
    }
    public void setBorrowed_status(Boolean borrowed_status) {
        this.borrowed_status = borrowed_status;
    }
    public String getDate_borrowed() {
        return date_borrowed;
    }
    public void setDate_borrowed(String date_borrowed) {
        this.date_borrowed = date_borrowed;
    }
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
}
