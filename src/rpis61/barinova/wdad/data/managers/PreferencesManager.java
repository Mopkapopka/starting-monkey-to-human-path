package rpis61.barinova.wdad.data.managers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public final class PreferencesManager {
    private static PreferencesManager pm;
    Appconfig rootElement;


     private void saveXML(File file, Class c, Object obj) throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(c);
         Marshaller marshaller = context.createMarshaller();
         marshaller.marshal(obj, file);
    }

     private Object loadXML(File file, Class c) throws JAXBException {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Object)unmarshaller.unmarshal(file);
        }


    public void readXml(File file) throws Exception
    {
        rootElement = (Appconfig) loadXML(file, Rmi.class);
    }


    public Rmi getRmi()
    {
        return rootElement.rmi;
    }

    public void setRmi(Rmi rmi)
    {
        rootElement.rmi = rmi;
    }

    public Server getServer()
    {
        return rootElement.rmi.server;
    }

    public void setServer(Server server)
    {
        rootElement.rmi.server = server;
    }

    public Client getClient()
    {
        return rootElement.rmi.client;
    }

    public void setClient(Client client)
    {
        rootElement.rmi.client = client;
    }

    public void setClassprovider(String classprovider)
    {
        rootElement.rmi.classprovider = classprovider;
    }

    public String getClassprovider()
    {
        return rootElement.rmi.classprovider;
    }

    public List<Object> getRegistryOrBindedObject()
    {
        return rootElement.rmi.server.registryOrBindedobject;
    }

    public void setRegistryOrBindedObject(List<Object> objects)
    {
        rootElement.rmi.server.registryOrBindedobject = objects;
    }

    public void setPolicyPath(String policyPath)
    {
        rootElement.rmi.client.policypath = policyPath;
    }

    public String getPolicyPath()
    {
        return rootElement.rmi.client.policypath;
    }

    public void setUseCodeBaseOnly(String useCodeBaseOnly)
    {
        rootElement.rmi.client.usecodebaseonly = useCodeBaseOnly;
    }

    public String getUseCodeBaseOnly()
    {
        return rootElement.rmi.client.usecodebaseonly;
    }



    public Appconfig getAppconfig() {
        return rootElement;
    }


    public void setAppconfig(Appconfig appconfigObject) {
        this.rootElement = appconfigObject;
    }

    private PreferencesManager(Appconfig appconfigObject){
        this.rootElement=appconfigObject;
    }

    public static PreferencesManager getPm( Appconfig appconfigObject) {
        if (pm== null) {
            pm = new PreferencesManager(appconfigObject);
        }
        return pm;
    }
}
