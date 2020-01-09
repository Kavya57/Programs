package bookweb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class BookController 
{
    BookDAO bdao;
    @Autowired
    BookController(BookDAO bdao)
    {
    	this.bdao=bdao;
    }
    @GetMapping("/bookPage")
    public String getBookPage(Model model)
    {
    	model.addAttribute("book",new Book(0,"",0.0,""));
    	return "DisplayBook";
    }
    @GetMapping("/bookCRUD")
    public String bookCrud(@RequestParam("sub")String sub,@RequestParam("bookid")int bookid,
 		   @RequestParam("book_title")String book_title,@RequestParam("book_price")double book_price,@RequestParam("book_author")String book_author,
 		   RedirectAttributes ra)
    {
    	ra.addFlashAttribute("book",new Book(bookid,book_title,book_price,book_author));
    	String val="";
        if(sub.equals("Add_Book"))	val="addBook";
        else if(sub.equals("Del_Book")) val="deleteBook";
        else if(sub.equals("Mod_Book")) val="modifyBook";
        else val="getBook";
        return "redirect:"+val;
    }
    @GetMapping("/addBook")
    public String addBook(@ModelAttribute("book")Book b)
    {
    	 bdao.insertBook(new Book(b.getBookid(),b.getBook_title(),b.getBook_price(),b.getBook_author()));
    	 return "DisplayBook";
    }
    @GetMapping("/modifyBook")
    public String modifyBook(@ModelAttribute("book")Book b)
    {
 	    bdao.modifyBook(new Book(b.getBookid(),b.getBook_title(),b.getBook_price(),b.getBook_author()));
 	    return "DisplayBook";
    }
    @GetMapping("/deleteBook")
    public String deleteBook(@ModelAttribute("book")Book b)
    {
    	bdao.deleteBook(b.getBookid());
    	return "DisplayBook";
    }
    @GetMapping("/getBook")
    public String getBook(@ModelAttribute("book")Book b,Model model)
    {
    	Book b1 = bdao.getBook(b.getBookid());
    	model.addAttribute("book",b1);
    	return "DisplayBook";
    }
}
