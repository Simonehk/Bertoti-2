public class App {
    public static void main(String[] args) throws Exception {
        StockExchange stockExchange = new StockExchange();
        stockExchange.addObserver(new BuyStockListener());        
        stockExchange.addObserver(new SellStockListener());
        stockExchange.start();
    }
}
