package rpis61.barinova.wdad.data.managers;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "rmi"
})
public class Appconfig {
    @XmlElement(required = true)
    protected Rmi rmi;

    public Rmi getRmi() {
        return rmi;
    }

    public void setRmi(Rmi rmiObject) {
        this.rmi = rmiObject;
    }
}
