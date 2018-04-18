package mx.com.kubo.preventers.bonus;

import mx.com.kubo.preventers.bonus.impl.BonusCustomerService;
import mx.com.kubo.preventers.bonus.impl.BonusPremiumCustomerService;
import mx.com.kubo.preventers.reports.impl.Invoice;

import java.math.BigDecimal;

public class BonusCustomerMediator implements Bonus, CustomerServiceInfo {
    Employee employee;
    Bonus bonus;

    public BonusCustomerMediator(Employee employee, Invoice invoice, BonusType bonusType) {
        this.employee = employee;
        if(bonusType == BonusType.REGULAR) {
            bonus = new BonusCustomerService(invoice);
        }else if(bonusType == BonusType.PREMIUM){
            bonus = new BonusPremiumCustomerService(invoice);
        }else {
            throw new RuntimeException("Invalid arguments");
        }


    }

    @Override
    public BigDecimal calculateBonus() {
        return bonus.calculateBonus();
    }

    @Override
    public String bonusType() {
        return bonus.bonusType();
    }

    @Override
    public String getHeader() {
        return employee.getId() + " - "+ employee.getName()+ " - "+employee.getType();
    }
}
