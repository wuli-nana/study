package classes;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private double price;
    private int count;
    private int currenCount;
    public Book(String ISBN,String title,String author,double price,int count){
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.count = count;
        this.price = price;
    }
    public boolean is (String ISBN){
        return this.ISBN.equals(ISBN);
    }
    public void increaseCount (int count){
        currenCount = count;
    }
}
