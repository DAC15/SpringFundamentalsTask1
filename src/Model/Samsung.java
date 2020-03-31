package Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Device {

    private String model;
    private int Ram;
    @Autowired
    @Qualifier("Samsung")
    private User samsungUser;
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public User getSamsungUser() {
        return samsungUser;
    }

    public void setSamsungUser(User samsungUser) {
        this.samsungUser = samsungUser;
    }
}
