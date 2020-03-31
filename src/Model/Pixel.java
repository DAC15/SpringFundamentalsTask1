package Model;

public class Pixel implements Device {

    private String model;
    private int Ram;

    private User pixelUser;

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

    public User getPixelUser() {
        return pixelUser;
    }

    public void setPixelUser(User pixelUser) {
        this.pixelUser = pixelUser;
    }
}
