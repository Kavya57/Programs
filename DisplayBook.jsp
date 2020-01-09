<%@page isELIgnored="false" %>
<html>
<body>
    <form action="bookCRUD">
      <table align=center width=50%>
        <tr>
          <th>Book Id</th>
          <td><input type=text name=bookid value=${book.bookid }></td>
        </tr>
        <tr>
          <th>Book title</th>
          <td><input type=text name=book_title value=${book.book_title }></td>
        </tr>
        <tr>
          <th>Book price </th>
          <td><input type=text name=book_price value=${book.book_price }></td>
        </tr>
        <tr>
          <th>Book author </th>
          <td><input type=text name=book_author value=${book.book_author }></td>
        </tr>
        <tr>
          <td><input type=submit value="Add_Book" name="sub"></td>
          <td><input type=submit value="Del_Book" name="sub"></td>
          <td><input type=submit value="Mod_Book" name="sub"></td>
          <td><input type=submit value="Get_Book" name="sub"></td>
        </tr> 
      </table>
    </form>
</body>
</html>