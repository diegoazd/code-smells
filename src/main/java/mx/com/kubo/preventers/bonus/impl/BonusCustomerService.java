package mx.com.kubo.preventers.bonus.impl;

import mx.com.kubo.preventers.bonus.Bonus;
import mx.com.kubo.preventers.bonus.Employee;
import mx.com.kubo.preventers.reports.impl.Invoice;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public class BonusCustomerService implements Bonus 
{
   private Employee employee;
   private Invoice invoice;
   
    public BigDecimal calculateBonus() 
    {
       return BonusCalculator.builder()
       .invoice(invoice)
       .bonusFactor(CUSTOMER)
       .build()
       .calculate();
    }

    public String bonusType() 
    {
        return "Customer service bonus";
    }

    public String getHeader() 
    {
        return BonusCalculator.builder()
        .employee(employee)
        .build()
        .getHeader();
    }
}
