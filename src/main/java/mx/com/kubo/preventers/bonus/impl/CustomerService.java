package mx.com.kubo.preventers.bonus.impl;

import lombok.Getter;
import lombok.Builder;

import mx.com.kubo.preventers.bonus.Employee;

@Getter
@Builder
public class CustomerService implements Employee 
{    
	private int id;
	
    @Builder.Default
    private String type = "Customer Service";
    private String name;
}
