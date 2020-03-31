package Model;

public class Samsung implements Device {

    private String model;
    private int Ram;

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
