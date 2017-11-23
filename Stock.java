public class Stock {

    private String companyName;
    private float price;
    private float priceChange;

    public Stock(String companyName, float price){
        this.companyName = companyName;
        this.price = price;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPriceChange(float priceChange) {
        this.priceChange = priceChange;
    }

    public String getCompanyName() {
        return companyName;
    }

    public float getPrice() {
        return price;
    }

    public float getPriceChange() {
        return priceChange;
    }

}
