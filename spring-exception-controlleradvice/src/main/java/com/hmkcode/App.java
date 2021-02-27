package com.hmkcode;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class App {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}