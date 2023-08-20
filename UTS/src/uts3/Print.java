package uts3;

public class Print extends Resource{
    String author ;
    String publisher;
    String category;
    Integer isbn;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Integer getIsbn() {
        return isbn;
    }
    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }
    
    @Override
    public void setDue_date(String due_date) {
        // TODO Auto-generated method stub
        super.setDue_date(due_date);
    }

}