package rpis61.barinova.wdad.learn.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlTask {
    Library library;
    File file;

    XmlTask(File file, Library library){
        this.file = file;
        this.library = library;
    }
    public void writeXML(File file) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Library.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(library,file );
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller.marshal(library, System.out );
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void readXML() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Library.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        library = (Library) unmarshaller.unmarshal(file);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(library, System.out );
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public List<Reader> negligentReaders(){
        ArrayList<Reader> r = new ArrayList<>();
        for (int i=0; i<library.readersAmount();i++) {
            if (library.isDebtor(library.getReader(i))) {
                r.add(library.getReader(i));
            }
        }
        return r;
    }

    public boolean removeBook(Reader reader, Book book){
        if (library.getReader( reader.getFirstName(),
                reader.getSecondName()) == null)
        return false;
        library.getReader(
                reader.getFirstName(),
                reader.getSecondName()
        ).returnBook(book);
        writeXML(file);
        return true;
    }

    public void addBook (Reader reader, Book book){
        if(library.getReader( reader.getFirstName(),reader.getSecondName()) == null){
            library.openLibraryCard(reader);
        }
        library.getReader(
                reader.getFirstName(),
                reader.getSecondName()
        ).takeBook(book);
        writeXML(file);
    }

    public List<Book> takenBooks(Reader reader) {
        if (reader == null) {
            throw new NullPointerException();
        }
        return reader.getTakenBooks();
    }
}
