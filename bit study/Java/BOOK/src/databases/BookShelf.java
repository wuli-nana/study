package databases;

import classes.Book;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> booklist = new ArrayList<>();
    //饿汉模式
    private static BookShelf instance = new BookShelf();
    public static  BookShelf getInstance(){
        return instance;
    }

    public Book search(String ISBN){
        for (Book book:booklist) {
            if(book.is(ISBN)){
                return book;
            }

        }
        throw new NoSuchBookException(ISBN);
    }
    public void putBook(Book book){
        booklist.add(book);
    }

}
