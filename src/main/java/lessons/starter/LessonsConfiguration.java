package lessons.starter;

import lessons.services.GreetingService;
import lessons.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LessonsConfiguration {

    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
