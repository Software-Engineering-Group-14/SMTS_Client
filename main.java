public class main {
    public static void main(String[] args) {
        User newUser = new User("Owen", (float) 100000000.47);
        Stock AAPL = new Stock("AAPL", (float) 567.32);

        new Buy(newUser, AAPL, 5).buyStock();

        for (int i = 0; i < newUser.getStocks().size(); i++){
            System.out.println(newUser.getStocks().get(i).getCompanyName());
        }
        System.out.println(newUser.getUserName() + "'s Total money = " + newUser.getMoney());
        System.out.println("----------------------------------------------------------------");
        new Sell(newUser).sellStock(AAPL);

        for (int i = 0; i < newUser.getStocks().size(); i++){
            System.out.println(newUser.getStocks().get(i).getCompanyName());
        }
        System.out.println(newUser.getUserName() + "'s Total money = " + newUser.getMoney());
    }
}
