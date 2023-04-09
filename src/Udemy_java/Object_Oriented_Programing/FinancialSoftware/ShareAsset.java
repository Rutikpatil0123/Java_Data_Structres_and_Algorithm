package Udemy_java.Object_Oriented_Programing.FinancialSoftware;

public class ShareAsset {

    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    public void addCost(double cost){

        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
