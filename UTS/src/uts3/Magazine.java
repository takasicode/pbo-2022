package uts3;

public class Magazine extends Print {
    Integer ISSN;
    Integer Issue;

    public Integer getISSN() {
        return ISSN;
    }
    public void setISSN(Integer iSSN) {
        ISSN = iSSN;
    }
    public Integer getIssue() {
        return Issue;
    }
    public void setIssue(Integer issue) {
        Issue = issue;
    }

}