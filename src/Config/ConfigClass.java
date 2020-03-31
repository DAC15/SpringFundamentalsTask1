package Config;

import Model.Pixel;
import Model.Samsung;
import Model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Model")
public class ConfigClass {

@Bean
@Qualifier("Samsung")
    public User getSamsungUser(){
    return new User();
}
    @Bean
    @Qualifier("Pixel")
    public User getPixelUser(){
        return new User();
    }


}
