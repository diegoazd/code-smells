package mx.com.kubo.preventers.bonus.impl;

import mx.com.kubo.preventers.bonus.Bonus;
import mx.com.kubo.preventers.bonus.Employee;
import mx.com.kubo.preventers.reports.impl.Invoice;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public class BonusPremiumCustomerService implements Bonus 
{
    private Employee employee;
    private Invoice invoice;

    public BigDecimal calculateBonus() 
    {
        return BonusCalculator.builder()
        .invoice(invoice)
        .bonusFactor(PREMIUM)
        .build()
        .calculate();
    }

    public String bonusType() 
    {
        return "Premium customer service";
    }

    public String getHeader() 
    {
        return BonusCalculator.builder()
        .employee(employee)
        .build()
        .getHeader();
    }
}
