package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLogbackLog4jdbcTestApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(DemoLogbackLog4jdbcTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Logback Project");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        sb.append("Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off");
//        while (true) {
//            logger.info(sb.toString());
//            Thread.sleep(10);
//        }
    }
}
