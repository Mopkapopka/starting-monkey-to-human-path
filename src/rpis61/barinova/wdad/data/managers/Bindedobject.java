package rpis61.barinova.wdad.data.managers;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bindedobject")
public class Bindedobject {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "class", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String value) {
        this.clazz = value;
    }
}
