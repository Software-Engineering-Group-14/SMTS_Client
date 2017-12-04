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



            this.user.removeStock(indexOfStock);++
        }
    }

    private boolean sellStockOnServer(Connect connection, Stock stock, String id, String quantityToSell){

        String stockName = stock.getCompanyName();

        conn.sendMessage("SELL:" + stockName + ":" + quantityToSell + ":" + id);
    }
}
