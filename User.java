import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Stock> stocks = new ArrayList<Stock>();
    private float money;
    private float amountSpent;

    public User(String name, float moneyToUse) {
        this.userName = name;
        this.money = moneyToUse;
    }

    //Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void addMoney(float moneyToAdd) {
        this.money += moneyToAdd;
    }
    public void removeMoney(float moneyToDeduct) {
        this.money -= moneyToDeduct;
    }
    public void removeStock(int indexOfStock){
        this.getStocks().remove(indexOfStock);
    }
    public void addStock(Stock stockToAdd) {
        this.stocks.add(stockToAdd);
    }
    public void updateAmountSpent(float amountSpentToAdd) {
        this.amountSpent += amountSpentToAdd;
    }

    //Getters
    public String getUserName() {
        return userName;
    }
    public List<Stock> getStocks() {
        return stocks;
    }
    public float getMoney() {
        return money;
    }
    public float getAmountSpent() {
        return amountSpent;
    }
}