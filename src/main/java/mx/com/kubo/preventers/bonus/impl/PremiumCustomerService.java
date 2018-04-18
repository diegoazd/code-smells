package mx.com.kubo.preventers.bonus.impl;

import lombok.Builder;
import lombok.Getter;
import mx.com.kubo.preventers.bonus.Employee;

@Getter
@Builder
public class PremiumCustomerService implements Employee 
{
    private int id;
    
    @Builder.Default
    private String type = "Premium Customer Service";
    private String name;
}
