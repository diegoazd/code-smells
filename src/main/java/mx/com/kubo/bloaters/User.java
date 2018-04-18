package mx.com.kubo.bloaters;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User 
{
    private String user;
    private String password;
    
    private int role;
}
