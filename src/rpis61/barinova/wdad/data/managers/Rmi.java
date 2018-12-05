package rpis61.barinova.wdad.data.managers;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "server",
        "client",
        "classprovider"
})
@XmlRootElement(name = "rmi")
public class Rmi {
    @XmlElement(required = true)
    protected Server server;
    @XmlElement(required = true)
    Client client;
    protected String classprovider;

    public Server getServer() {
        return server;
    }

    public Client getClient() {
        return client;
    }

    public String getClassprovider() {
        return classprovider;
    }


    public void setServer(Server serverObject) {
        this.server = serverObject;
    }

    public void setClient(Client clientObject) {
        this.client = clientObject;
    }

    public void setClassprovider(String classprovider) {
        this.classprovider = classprovider;
    }
}
