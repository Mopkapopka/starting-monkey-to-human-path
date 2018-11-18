package rpis61.barinova.wdad.learn.xml;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBException;

public class XmlTask_test {
    public static void main(String[] args) throws JAXBException {
        File file = new File("C:\\Users\\Rina\\IdeaProjects\\starting-monkey-to-human-path\\src\\rpis61\\barinova\\wdad\\learn\\xml/file.xml");
        Reader reader = new Reader("Yekaterina","Vaar");
        Author author = new Author("Эрик","Шпикерман");
        Book book = new Book(author,"О шрифте","2010",Genre.NOVEL, "1999-12-12");
        reader.takeBook(book);
        Book book2 = new Book(author,"Пёся","2015",Genre.NOVEL, "2017-12-12");
        reader.takeBook(book2);
        Library library = new Library();
        library.openLibraryCard(reader);
        XmlTask xt = new XmlTask(file,library);
        xt.writeXML(file);
        xt.readXML();
        System.out.println("Взятые книги");
        List<Book> books = xt.takenBooks(reader);
        System.out.println(books);
        System.out.println("Должник");
        List<Reader> readers = xt.negligentReaders();
        System.out.println(readers.get(0).toString());
        System.out.println( xt.removeBook(reader,book) );
    }
}
