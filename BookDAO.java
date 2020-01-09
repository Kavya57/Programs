package bookweb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BookDAO 
{
    SessionFactory sessionFactory;
    @Autowired
    public BookDAO(SessionFactory sessionFactory)
    {
    	this.sessionFactory=sessionFactory;
    }
    public void insertBook(Book b)
    {
    	Session session = sessionFactory.openSession();
    	session.save(b);
    	session.beginTransaction().commit();
    }
    public void deleteBook(int bookid)
    {
    	Session session = sessionFactory.openSession();
    	Book b = session.get(Book.class,bookid);
    	session.delete(b);
    	session.beginTransaction().commit();
    }
    public void modifyBook(Book b)
    {
    	Session session = sessionFactory.openSession();
    	Book b1 = session.get(Book.class,b.getBookid());	
    	b1.setBook_title(b.getBook_title());  b1.setBook_price(b.getBook_price());
    	session.beginTransaction().commit();
    }
    public Book getBook(int bookid)
    {
    	Session session = sessionFactory.openSession();
    	return session.get(Book.class,bookid);
    }
}

