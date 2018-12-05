package rpis61.barinova.wdad.data.managers;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "registryOrBindedobject"
})
@XmlRootElement(name = "server")
public class Server {
    @XmlElements({
            @XmlElement(name = "registry", required = true, type = Registry.class),
            @XmlElement(name = "bindedobject", required = true, type = Bindedobject.class)
    })

    protected List<Object> registryOrBindedobject;

    public List<Object> getRegistryOrBindedobject() {
        if (registryOrBindedobject == null) {
            registryOrBindedobject = new ArrayList<Object>();
        }
        return this.registryOrBindedobject;
    }
//    Registry RegistryObject;
//
//    public Registry getRegistry() {
//        return RegistryObject;
//    }
//
//    public void setRegistry(Registry registryObject) {
//        this.RegistryObject = registryObject;
//    }
}
