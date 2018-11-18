package rpis61.barinova.wdad.learn.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.ArrayList;

@XmlRootElement
public class Library {

    private ArrayList<Reader> readers;

    Library () {
        readers = new ArrayList<>();
    }

    @XmlElement
    public ArrayList<Reader> getReaders(){
        return readers;
    }

    Library(ArrayList<Reader> readers) {
        if (!readers.isEmpty())
        this.readers = readers;
    }

    public void openLibraryCard(Reader reader){
        readers.add(reader);
    }

    int readersAmount () {
        return readers.size();
    }

    Reader getReader(int i){
        return readers.get(i);
    }

    Reader getReader(String firstName, String secondName){
        for (Reader r: readers) {
            if (r.getFirstName().equals(firstName) && r.getSecondName().equals(secondName)) return r;
        }
        return null;
    }

    boolean isDebtor (Reader r) {

        for (Book b : r.getTakenBooks()) {
            LocalDate date = LocalDate.parse(b.getTakeDate());
            if ((int)(LocalDate.now().toEpochDay() - date.toEpochDay() )> 14)
                return true;
        }
        return false;
    }
}
