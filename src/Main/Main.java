package Main;

import Config.ConfigClass;
import Model.Pixel;
import Model.Samsung;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        Samsung samsung = context.getBean(Samsung.class);
        Pixel pixel = context.getBean(Pixel.class);

        samsung.setModel("Galaxy S20 Ultra");
        System.out.println(samsung.getModel());

        pixel.setRam(5);
        System.out.println(pixel.getRam());


    }
}
