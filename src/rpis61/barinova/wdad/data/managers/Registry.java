package rpis61.barinova.wdad.data.managers;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "createregistry",
        "registryaddress",
        "registryport"
})
public class Registry {
    @XmlElement(required = true)
    protected String createregistry;
    @XmlElement(required = true)
    protected String registryaddress;
    @XmlElement(required = true)
    protected String registryport;

    public String getCreateregistry() {
        return createregistry;
    }

    public String getRegistryaddress() {
        return registryaddress;
    }

    public String getRegistryport() {
        return registryport;
    }


    public void setCreateregistry(String createregistry) {
        this.createregistry = createregistry;
    }

    public void setRegistryaddress(String registryaddress) {
        this.registryaddress = registryaddress;
    }

    public void setRegistryport(String registryport) {
        this.registryport = registryport;
    }
}
