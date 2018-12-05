package rpis61.barinova.wdad.data.managers;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "policypath",
        "usecodebaseonly"
})
@XmlRootElement(name = "client")
public class Client {
    @XmlElement(required = true)
    protected String policypath;
    @XmlElement(required = true)
    protected String usecodebaseonly;


    public String getPolicypath() {
        return policypath;
    }

    public String getUsecodebaseonly() {
        return usecodebaseonly;
    }


    public void setPolicypath(String policypath) {
        this.policypath = policypath;
    }

    public void setUsecodebaseonly(String usecodebaseonly) {
        this.usecodebaseonly = usecodebaseonly;
    }
}
