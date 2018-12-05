package rpis61.barinova.wdad.data.managers;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Server createServer() {
        return new Server();
    }

    public Registry createRegistry() {
        return new Registry();
    }

    public Bindedobject createBindedobject() {
        return new Bindedobject();
    }

    public Appconfig createAppconfig() {
        return new Appconfig();
    }

    public Rmi createRmi() {
        return new Rmi();
    }

    public Client createClient() {
        return new Client();
    }
}
