package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "income_stat")
public class IncomeStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "income_stat")
    private int incomeStatId;

    @OneToMany
    @JoinColumn(name = "bill_id")
    private List<Bill> listOfBill;

    @Column(name = "period")
    private String period;

    @Column(name = "revenue")
    private float revenue;

    public IncomeStat() {

    }

    public int getIncomeStatId() {
        return incomeStatId;
    }

    public void setIncomeStatId(int incomeStatId) {
        this.incomeStatId = incomeStatId;
    }

    public List<Bill> getListOfBill() {
        return listOfBill;
    }

    public void setListOfBill(List<Bill> listOfBill) {
        this.listOfBill = listOfBill;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }
}
