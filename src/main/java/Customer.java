public class Customer {

    private String name;
    private double wallet;
    private Gallery gallery;

    //    Constructor
    public Customer(String inputName, double inputWallet){
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getCustomerName() {
        return this.name;
    }

    public double getWalletAmount(){
        return this.wallet;
    }

    public void buyArtwork(Gallery gallery){
        

        this.gallery = gallery;
    }


    public void reduceMoney (double inputAmount){
    if (inputAmount > 0 && inputAmount <= this.wallet)
    this.wallet -= inputAmount;
    }




}
