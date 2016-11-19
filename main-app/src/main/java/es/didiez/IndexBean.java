package es.didiez;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 *
 * @author diego
 */
@Component
@RequestScope
public class IndexBean {
    
    public String welcome(){
        return "Hi!";
    }    
}
