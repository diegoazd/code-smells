package mx.com.kubo.preventers.bonus.impl;

import java.math.BigDecimal;

import lombok.Builder;
import mx.com.kubo.preventers.bonus.Employee;
import mx.com.kubo.preventers.reports.impl.Invoice;

@Builder
public class BonusCalculator 
{
    private Employee employee;
    
	private Invoice invoice;
	
	private double bonusFactor;
	
    public BigDecimal calculate() 
    {
        return invoice
        .getLineItem()
        .stream()
        .map(item -> item.getPrice())
        .reduce(BigDecimal.ZERO, BigDecimal::add)
        .multiply(BigDecimal.valueOf(bonusFactor));
    }
    
    public String getHeader() 
    {
        return new StringBuilder()
       .append(employee.getId())
       .append(" - ")
       .append(employee.getName())
       .append(" - ")
       .append(employee.getType())
       .toString();
    }
    
    
}
