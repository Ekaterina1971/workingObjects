import java.util.Objects;

public class Book {
  private String bookName;
  private Author author;
  private int bookAge;

  public Book(String bookName, Author author, int bookAge){
      this.bookName = bookName;
      this.author = author;
      this.bookAge = bookAge;
  }
  public String getBookName(){return this.bookName;}
  public int getBookAge(){return this.bookAge;}
  public Author getAuthor(){return author;}
  public void setBookAge( int i){}
@Override
 public String toString(){
      return "Название книги " + bookName + "." + " Автор " + author.toString() + "." + " год издания " + bookAge + ".";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book =(Book)o;
        return bookName.equals(book.bookName) && author.equals(book.author) && bookAge == book.bookAge;
    }
    public int hashCode(){
      return Objects.hash(bookName, author, bookAge);
    }
}
