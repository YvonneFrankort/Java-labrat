package viikko4.lab;

public class Book {
    private String title, author;
    private Integer year;

    public Book(String t, String a, Integer y) {
        if(t == null || t.trim().isEmpty()){
            throw new IllegalArgumentException("Needs a title");
        }
        if(a == null || t.trim().isEmpty()){
            throw new IllegalArgumentException("Needs an author");
        }
        if(y == null || y < 0){
            throw new IllegalArgumentException("Year value");
        }
        this.title = t;
        this.author = a;
        this.year = y;
    }

    public String label() {
        return author + ":" + title + "("+ year + ")";
    }
}