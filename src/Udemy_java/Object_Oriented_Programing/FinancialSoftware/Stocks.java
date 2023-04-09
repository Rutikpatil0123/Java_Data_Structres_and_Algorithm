package Udemy_java.Object_Oriented_Programing.FinancialSoftware;

public class Stocks extends ShareAsset implements Asset{


    private int totalShares;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShares*getCurrentPrice();
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
