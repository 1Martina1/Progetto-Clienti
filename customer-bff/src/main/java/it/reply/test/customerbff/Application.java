package it.reply.test.customerbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
	"it.reply.test.customerbff"
})
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}