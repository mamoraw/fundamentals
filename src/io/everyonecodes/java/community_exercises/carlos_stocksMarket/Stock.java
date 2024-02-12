package io.everyonecodes.java.community_exercises.carlos_stocksMarket;

public class Stock {
    String name;
    String symbol;
    String industry;
    double currentPrice;
    double ratio;
    double eps;
    boolean paysDividends;
    double dividendYield;

    int point;
    double sharesToBuy;


    public Stock(String name, String symbol, String industry, double currentPrice, double ratio, double eps, boolean paysDividends, double dividendYield) {
        this.name = name;
        this.symbol = symbol;
        this.industry = industry;
        this.currentPrice = currentPrice;
        this.ratio = ratio;
        this.eps = eps;
        this.paysDividends = paysDividends;
        this.dividendYield = dividendYield;

    }
}
