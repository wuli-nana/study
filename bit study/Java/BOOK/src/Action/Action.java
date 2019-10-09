package Action;

import classes.Book;
import databases.BookShelf;

public class Action {
    /**
     * 图书上架
     * 1.如果已经有了，增加数目（存量/总量）
     *
     */
    public static Book putbook(String ISBN,String title,System author,double price,int count){
        BookShelf bookShelf = BookShelf.getInstance();
        try{
            Book book = bookShelf.search(ISBN);
            book.increaseCount(count);
            return book;
        }catch(NoSuchBookException exc){
            Book book = new Book(ISBN,title,author,price,count);
            bookShelf.putBook(book);
            return book;
        }

    }
}
