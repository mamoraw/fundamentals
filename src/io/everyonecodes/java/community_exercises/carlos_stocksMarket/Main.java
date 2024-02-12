package io.everyonecodes.java.community_exercises.carlos_stocksMarket;
//John wants  to invest $1000 and would like to allocate it evenly through 5 different companies.
//He gives you two lists of stocks, one with stocks he has already invested and one with new stocks he has in his watchlist.
//
//Help him decide which stocks he should invest/reinvest in according to his specifics rules and criteria (shown below).
//Assume his broker allows him to buy fractional shares (meaning he can buy a fraction of a share and not necessarily the whole share).
//
//Tasks:
//Print a list with names of the stocks that comply with his investing hard rules
//Print a list of potential stocks to invest with their ranking points
//Print the ticker symbol of the 5 stocks he should invest/reinvest in, the appraisal value and how many shares (or fractions) he could buy from each.
//
//For this investing round John has some hard rules to pick a stock:
//P/E ratio must be below 75
//EPS must be positive
//He does not want to invest/reinvest in the following industries:
//Aerospace and Defense
//Restaurants
//
//To rank stocks, John gives points to each stock depending on certain indicator values.
//Earnings per share (EPS):
//Negative EPS: -3 points
//EPS between 0 and 15: 1 point
//EPS between 16 and 30: 2 points
//EPS above 30: 4 points
//
//Price to earnings ratio (P/E):
//P/E below 15: 3 point
//P/E between 15 and 30 : 4 points
//P/E between 31 and 45: 2 points
//P/E above 45: 1 point
//
//Dividend Yield:
//Dividend yield N/A : 0 points
//Dividend yield  between 2% and 4%: 4 points
//Any other value: 1 point
//
//
//Each stock should have the properties:
//Name
//Ticker symbol
//Industry
//Current Price
//P/E ratio
//EPS
//Pays dividends (true/false)
//Dividend Yield
//Ranking points
//Possible shares to buy


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        topFiveStocks(calculatePoints(checkNames()));
    }

    public static int calculateDividendYield(double price, double dividendYield) {
        int points = 2;
//         not sure what Carlos wanted to happen here.
//        double percent = (dividendYield / price) * 100;
//        if (percent >= 4) {
//            points += 1;
//        } else if (percent >= 2) {
//            points += 4;
//        }
        return points;
    }

    public static void topFiveStocks(List<Stock> stocks) {

        // Here we make a copy of the Stock list and the then look for the stock with the highest points.
        // In the next step put the one with the highest points in a new list and remove it from the old list.
        // Then the maxPoints are reset.
        List<Stock> topFiveStocks = new ArrayList<>();
        List<Stock> stockToRemove = new ArrayList<>(stocks);
        Stock maxPoints = stockToRemove.getFirst();

        while (true) {
            for (Stock stock : stockToRemove) {
                if (stock.point > maxPoints.point) {
                    maxPoints = stock;
                }
            }
            // Add the new max to a new list and remove it from the list that is used in the loop.
            topFiveStocks.add(maxPoints);
            stockToRemove.remove(maxPoints);
            // Reset maxPoints, else it will remain the highest amount form the first loop and since there is
            // no higher value the new list ends up with 5 times the same stock.
            maxPoints = stockToRemove.getFirst();
            // Break the loop once the target size is reached. We end up with the 5 stocks with the biggest scores.
            if (topFiveStocks.size() == 5) {
                break;
            }
        }

        for (Stock stock : topFiveStocks) {
            System.out.println(stock.name + " - " + stock.point);
        }
    }

    public static List<Stock> calculatePoints(List<Stock> stocks) {
        List<Stock> stockWithPoints = new ArrayList<>();

        // Prints and return a List of Stock plus their points.
        for (Stock stock : stocks) {
            if (stock.eps > 30) {
                stock.point += 4;
            } else if (stock.eps >= 16) {
                stock.point += 2;
            } else if (stock.eps >= 0) {
                stock.point += 1;
            } else {
                stock.point -= 3;
            }

            if (stock.ratio > 45) {
                stock.point += 1;
            } else if (stock.ratio >= 31) {
                stock.point += 2;
            } else if (stock.ratio >= 15 && stock.ratio <= 30) {
                stock.point += 4;
            } else {
                stock.point += 3;
            }
            // Calculate addition points and adds them. Then the stock gets added to the new list.
            stock.point += calculateDividendYield(stock.currentPrice, stock.dividendYield);
            stockWithPoints.add(stock);
        }

        for (Stock stock : stocks) {
            System.out.println(stock.name + " - " + stock.point);
        }
        System.out.println();

        return stockWithPoints;
    }

    public static List<Stock> checkNames() {
        List<Stock> oldAndNewStocks = new ArrayList<>(getOldStocksList());
        oldAndNewStocks.addAll(getNewStocksList());

        List<Stock> namesToInvest = new ArrayList<>();

        for (Stock stock : oldAndNewStocks) {
            if (!stock.industry.equals("Aerospace and Defense")
                    && !stock.industry.equals("Restaurants")
                    && stock.ratio <= 75
                    && stock.eps >= 0) {
                namesToInvest.add(stock);
            }
        }
        return namesToInvest;
    }

    public static List<Stock> getOldStocksList() {
        return List.of(
                new Stock("Amazon.com Inc.", "AMZN", "E-commerce and Cloud Computing", 153.73, 80.26, 1.92, false, 0),
                new Stock("Apple Inc.", "AAPL", "Consumer Electronics", 186.19, 30.35, 6.13, true, 0.0052),
                new Stock("Berkshire Hathaway Inc. ", "BRK.B", "Insurance - Diversified", 367.92, 0.01, 52740.98, false, 0),
                new Stock("Tesla Inc.", "TSLA", "Auto Manufacturers", 233.94, 75.38, 3.1, false, 0),
                new Stock("Vanguard Total Stock Market Index Fund", "VTI", "Exchange-Traded Fund", 237.23, 0, 0, true, 0.0144),
                new Stock("Lockheed Martin Corp.", "LMT", "Aerospace and Defense", 455.4, 16.63, 27.38, true, 0.0277),
                new Stock("The Walt Disney Company", "DIS", "Entertainment", 89.29, 69.41, 1.29, true, 0.0067),
                new Stock("Alphabet Inc. ", "GOOG", "Internet Content & Information", 143.8, 27.56, 5.22, false, 0),
                new Stock("AT&T Inc.", "T", "Telecommunications", 16.87, 0, -1.62, true, 0.0658),
                new Stock("McDonald's Corp.", "MCD", "Restaurants", 294.09, 25.91, 11.35, true, 0.0227)
        );
    }

    public static List<Stock> getNewStocksList() {
        return List.of(
                new Stock("The Boeing Company", "BA", "Aerospace and Defense", 227.84, 0, -4.69, false, 0),
                new Stock("NVIDIA Corporation", "NVDA", "Semiconductors", 543.5, 71.76, 7.57, true, 0.0003),
                new Stock("International Business Machines Corporation", "IBM", "Information Technology Services", 161.23, 21.65, 7.45, true, 0.0412),
                new Stock("Chipotle Mexican Grill, Inc", "CMG", "Restaurants", 2245, 53.27, 42.15, false, 0),
                new Stock("Starbucks Corporation", "SBUX", "Restaurants", 93.5, 26.1, 3.58, true, 0.0244),
                new Stock("Netflix, Inc.", "NFLX", "Entertainment", 478.33, 47.69, 10.03, false, 0),
                new Stock("Microsoft Corporation", "MSFT", "Software - Infrastructure", 382.77, 37.07, 10.33, true, 0.0078),
                new Stock("Vanguard Value Index Fund", "VTV", "Exchange-Traded Fund", 149.84, 0, 0, true, 0.0246)
        );
    }
}
