public class Sell {
    private User user;

    public Sell (User user){
        if(user != null){
            this.user = user;
        }
    }

    public void sellStock(Stock stock){
        if (this.user.getStocks().contains(stock)) {
            int indexOfStock = this.user.getStocks().lastIndexOf(stock);
            this.user.removeStock(indexOfStock);
            this.user.addMoney(stock.getPrice());
        }
    }
}
