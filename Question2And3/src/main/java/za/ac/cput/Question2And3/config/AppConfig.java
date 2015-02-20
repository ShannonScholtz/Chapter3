package za.ac.cput.Question2And3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Question2And3.AutoShopInterface;
import za.ac.cput.Question2And3.AutoShopParts;


/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {

    @Bean(name = "auto")
    public AutoShopInterface getVal()
    {
        return new AutoShopParts();
    }
}
