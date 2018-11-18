package rpis61.barinova.wdad.learn.xml;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Reader extends Man{
    private ArrayList<Book> takenBooks;

    private Reader(){
        super();
    }

    Reader(String firstName, String secondName) {
        super(firstName, secondName);
        takenBooks = new ArrayList<>();
    }

    void takeBook(Book book){
        takenBooks.add(book);
    }

    boolean returnBook(Book book){
        for (Book b : takenBooks){
            if(b.getName().equals(book.getName()) &&  b.getAuthor().equals(book.getAuthor())){
                takenBooks.remove(b);
                return true;
            }
        }
            return false;
    }

    @XmlElement(name = "book")
    public ArrayList<Book> getTakenBooks() {
        return takenBooks;
    }
    public void setTakenBooks(ArrayList<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (takenBooks.isEmpty()) {
            sb.append(",no debts");
        } else {
            sb.append("\nbook(s) debt: ").append(takenBooks.size()).append("\n");
            for (int i = 0; i < takenBooks.size(); i++) {
                sb.append(takenBooks.get(i).toString()).append("\n");
            }
        }
        return sb.toString();
    }

}
