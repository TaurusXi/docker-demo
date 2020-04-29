package cn.diqidiqi.dockerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class DockerDemoApplication {

    private static final Logger LOGGER =  LoggerFactory.getLogger(DockerDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }


    @GetMapping("/")
    public String index(){

        String currentTime = new Date().toString();
        LOGGER.info("Path -> / --- currentTime -> {}", currentTime);

        return "hello,docker spring boot demo ----> " + currentTime;
    }

}
