package demo.msa.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: menfeng
 * @Date: 2019/5/27 13:55
 * @Version 1.0
 */
@RestController
@SpringBootApplication
public class Application {

@RequestMapping("/")
    public String index(){
    return "hello";
}

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
