package mx.com.kubo.preventers.bonus;

import java.math.BigDecimal;

public interface Bonus 
{
	static final double CUSTOMER = 0.05d;
	static final double PREMIUM = 0.07d;
	
    BigDecimal calculateBonus();
    String bonusType();
    String getHeader();
}
