package uts3;

public class Novel extends Print{
    String Genre;
    String Blurb;

    public String getGenre() {
        return Genre;
    }
    public void setGenre(String genre) {
        Genre = genre;
    }
    public String getBlurb() {
        return Blurb;
    }
    public void setBlurb(String blurb) {
        Blurb = blurb;
    }
}