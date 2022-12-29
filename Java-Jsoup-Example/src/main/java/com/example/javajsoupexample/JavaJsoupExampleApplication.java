package com.example.javajsoupexample;

import com.example.javajsoupexample.component.stock.JsoupExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class JavaJsoupExampleApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(JavaJsoupExampleApplication.class, args);
        JsoupExample jsoupExample = new JsoupExample();
        jsoupExample.example("https://www.musinsa.com/app/goods/2747337");
    }

}
