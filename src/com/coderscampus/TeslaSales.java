package com.coderscampus;

import java.time.YearMonth;

public class TeslaSales {

    private YearMonth date;
    private int sales;

    public TeslaSales(YearMonth date, int sales) {
        this.date = date;
        this.sales = sales;
    }

    public YearMonth getDate() {
        return date;
    }

    public void setDate(YearMonth date) {
        this.date = date;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }


}
