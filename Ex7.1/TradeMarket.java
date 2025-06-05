public class TradeMarket implements Mediator {
    Trader bullTrader = new BullTrader();
    Trader bearTrader = new BearTrader();

    public TradeMarket() {
        bullTrader.setMediator(this);
        bearTrader.setMediator(this);
    }

    public void sellOperation() {
        bearTrader.sellOperation();
    }

    public void buyOperation() {
        bullTrader.buyOperation();
    }
}
