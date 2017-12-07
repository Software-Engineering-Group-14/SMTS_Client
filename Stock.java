public interface Stock{

    private String companyName;
    private float price;
    private float priceChange;

    public void setCompanyName();

    public void setPrice();

    public void setPriceChange();

    public String getCompanyName();

    public float getPrice();

    public float getPriceChange();
}