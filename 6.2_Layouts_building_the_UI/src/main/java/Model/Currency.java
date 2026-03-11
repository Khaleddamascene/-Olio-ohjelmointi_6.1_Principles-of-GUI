package Model;

public class Currency {

    private String code;
    private String name;
    private double rateToUSD;

    public Currency(String code, String name, double rateToUSD) {
        this.code = code;
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    @Override
    public String toString() {
        return code + " - " + name;
    }
}
