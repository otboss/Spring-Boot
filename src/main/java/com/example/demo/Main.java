import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Main {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}