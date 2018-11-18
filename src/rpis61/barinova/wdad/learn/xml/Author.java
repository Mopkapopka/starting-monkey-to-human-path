package rpis61.barinova.wdad.learn.xml;

public class Author extends Man {
    Author(){
        super();
    }

    Author(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String toString(){
       return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if  (obj==null && !this.getClass().equals(obj.getClass())) return false;
        Author a = (Author) obj;
        return (a.getFirstName().equals(this.getFirstName()) && a.getSecondName().equals(this.getSecondName()));
    }


}
