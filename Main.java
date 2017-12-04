import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Connect conn = new Connect("localhost", 5000);
        if(conn.connectToSocket()){
            conn.sendMessage("REGI"); //Register's the client's IP with the Server
            String id = conn.recieveMessage().findFirst().toString().split(":")[2].split("]")[0];
            System.out.println(id);

            List<Stock> stocks = new ArrayList<Stock>();


            conn.sendMessage("DISP:" + id);
            stocks = getStocksList(conn.recieveMessage().limit(13), stocks);

        }
    }





    private static List<Stock> getStocksList(Stream<String> ret, List<Stock> stocks){

        ret.forEach(stock -> {
            if(stock.startsWith("DEBUG: You entered: DISP") || stock.startsWith("END:EOF") || stock.startsWith("TIME:")){

            } else {
                String[] stockData = stock.split(":");
                String stockName = stockData[1];
                float stockPrice = Float.parseFloat(stockData[2]);
                float stockPriceChange = Float.parseFloat(stockData[3]);
                boolean foundStock = false;

                for (Stock stockItem : stocks) {
                    if (stockName.equals(stockItem.getCompanyName())) {
                        stockItem.setPrice(stockPrice);
                        stockItem.setPriceChange(stockPriceChange);
                        foundStock = true;
                        System.out.println("Updated Stock" + stockName);
                        break;
                    }
                }

                if (!foundStock) {
                    Stock newStock = new Stock(stockName, stockPrice, stockPriceChange);
                    stocks.add(newStock);
                    System.out.println("Added Stock" + stockName);
                }


            }
        });

        return stocks;
    }
}
