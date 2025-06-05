public class Main {

    BearTrader bear = new BearTrader();

    TradeMarket market = new TradeMarket(bull, bear);

    System.out.println("BullTrader initiates a buy operation:");
    bull.buyOperation();
    
    System.out.println("\nBearTrader initiates a sell operation:");
    bear.sellOperation();
}
