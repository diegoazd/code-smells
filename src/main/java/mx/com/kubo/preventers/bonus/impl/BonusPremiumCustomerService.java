package mx.com.kubo.preventers.bonus.impl;

import mx.com.kubo.preventers.bonus.Bonus;
import mx.com.kubo.preventers.bonus.CustomerServiceInfo;
import mx.com.kubo.preventers.bonus.Employee;
import mx.com.kubo.preventers.reports.impl.Invoice;

import java.math.BigDecimal;

public class BonusPremiumCustomerService implements Bonus {

    private Invoice invoice;

    public BonusPremiumCustomerService(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public BigDecimal calculateBonus() {
        return invoice.getLineItem().stream().map(item -> item.getPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .multiply(BigDecimal.valueOf(0.07d));
    }

    @Override
    public String bonusType() {
        return "Premium customer service";
    }
}
