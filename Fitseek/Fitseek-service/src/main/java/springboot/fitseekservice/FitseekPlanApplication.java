package springboot.fitseekservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"springboot.fitseekservice","springboot.fitseekcommon"})
public class FitseekPlanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitseekPlanApplication.class, args);
    }

}
