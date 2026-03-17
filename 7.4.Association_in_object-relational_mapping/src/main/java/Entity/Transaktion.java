package Entity;

import jakarta.persistence.*;

@Entity
public class Transaktion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;
    private double result;

    @ManyToOne
    private Currency2 sourceCurrency;

    @ManyToOne
    private Currency2 targetCurrency;

    public Transaktion() {
    }
    public Transaktion(double amount, double result, Currency2 sourceCurrency, Currency2 targetCurrency) {
        this.amount = amount;
        this.result = result;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public int getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public double getResult() {
        return result;
    }
    public Currency2 getSourceCurrency() {
        return sourceCurrency;
    }
    public Currency2 getTargetCurrency() {
        return targetCurrency;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public void setSourceCurrency(Currency2 sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }
    public void setTargetCurrency(Currency2 targetCurrency) {
        this.targetCurrency = targetCurrency;
    }
}