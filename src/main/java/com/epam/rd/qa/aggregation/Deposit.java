package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;

public abstract class Deposit {

    public BigDecimal amount;
    public int period;

    public Deposit (BigDecimal depositAmount, int depositPeriod) {
        if(depositPeriod<=0 || depositAmount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public BigDecimal getAmount() { return amount; }

    public int getPeriod() { return period; }

    abstract BigDecimal income();

}

