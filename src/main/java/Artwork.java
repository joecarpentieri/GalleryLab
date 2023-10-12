public class Artwork {

    private String title;
    private Artist artist;
    private double price;

//    Constructor

    public Artwork(String inputTitle, Artist inputArtist, double inputPrice){
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;
    }

    public String getArtworkTitle() {
        return this.title;
    }

    public Artist getArtworkArtist() {
        return this.artist;
    }

    public double getArtworkPrice() {
        return this.price;
    }
}
