package com.jenkins.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    @Component
    public class Runner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            System.out.println("test jenkins demo!");
            System.out.println("test jenkins demo!456");
        }
    }
}
