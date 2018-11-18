package rpis61.barinova.wdad.learn.xml;

abstract class Man {
    private String firstName;
    private String secondName;

    Man(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    Man(){
        firstName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" ").append(secondName);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }



}
