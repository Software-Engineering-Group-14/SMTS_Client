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

    public void buyStock() {
        for(int i = 0; i < amountToBuy; i++){
            if(user.getMoney() < stock.getPrice()){
                System.out.println("You don't have enough money");
                break;
            } else {
                user.removeMoney(stock.getPrice());
                user.updateAmountSpent(stock.getPrice());
                user.addStock(stock);
            }
        }
    }
}
