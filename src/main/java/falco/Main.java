package falco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
    SpringApplication.run(Main.class,args);
    }
    @GetMapping("/hello")
    public GreetResponse greet(){
        return new GreetResponse("Hello",List.of("TypeScript","Java"),new Person("Falco",33,30_000.0));
    }


    record Person (String name,int age,double saving){

    }
    record GreetResponse(
      String greet,
      List<String> favProgrammingLanguage,
      Person person
    ){}
    
}
