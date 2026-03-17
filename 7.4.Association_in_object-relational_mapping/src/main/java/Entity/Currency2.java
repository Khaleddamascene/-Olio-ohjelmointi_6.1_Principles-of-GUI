package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currency2")
public class Currency2{

    @Id
    private String code;
    private String name;
    private double rate;


    public Currency2() {
    }

    public Currency2(String code, String name, double rate) {
        this.code = code;
        this.name = name;
        this.rate = rate;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public double getRate() { return rate; }

    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }
    public void setRate(double rate) { this.rate = rate; }
}