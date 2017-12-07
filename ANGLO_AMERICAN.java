/**
 * ANGLO_AMECAN
 */
public class ANGLO_AMECAN implements Stock{

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setPriceChange(float priceChange) {
        this.priceChange = priceChange;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public float getPriceChange() {
        return priceChange;
    }

}