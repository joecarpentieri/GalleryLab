import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

//    Constructor
    public Gallery(String inputName, double inputTill){
        this.name = inputName;
        this.till = inputTill;
        this.stock = new ArrayList<Artwork>();
    }

    public String getGalleryName() {
        return this.name;
    }

    public double getGalleryTill() {
        return this.till;
    }

}
