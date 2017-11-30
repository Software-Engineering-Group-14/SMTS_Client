public class Buy {
    private User user;
    private Stock stock;
    private int amountToBuy;

    public Buy(User user, Stock stock, int amountToBuy){
        if(user != null && stock != null && amountToBuy != 0){
            this.user = user;
            this.stock = stock;
            this.amountToBuy = amountToBuy;
        } else {
            System.out.println("Error: Make sure values are set correctly");
        }
    }

    public int buyStock() {
        for(int i = 0; i < amountToBuy; i++){
            if(user.getMoney() < stock.getPrice()){
                return -1;
            } else {
                user.removeMoney(stock.getPrice());
                user.updateAmountSpent(stock.getPrice());
                user.addStock(stock);
              
            }
        }
        return 0;
    }
}
