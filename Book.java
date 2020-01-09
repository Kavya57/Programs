package bookweb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book
{
	@Id
  int bookid;
  String book_title;
  double book_price;
  String book_author;
public Book(int bookid, String book_title, double book_price, String book_author) {
	super();
	this.bookid = bookid;
	this.book_title = book_title;
	this.book_price = book_price;
	this.book_author = book_author;
}
public Book() {}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBook_title() {
	return book_title;
}
public void setBook_title(String book_title) {
	this.book_title = book_title;
}
public double getBook_price() {
	return book_price;
}
public void setBook_price(double book_price) {
	this.book_price = book_price;
}
public String getBook_author() {
	return book_author;
}
public void setBook_author(String book_author) {
	this.book_author = book_author;
}
  
}
