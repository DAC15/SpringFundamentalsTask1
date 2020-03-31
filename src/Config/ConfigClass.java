package Config;

import Model.Pixel;
import Model.Samsung;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Samsung getSamsung(){
        return new Samsung();
    }

    @Bean
    public Pixel getPixel(){
        return new Pixel();
    }


}
