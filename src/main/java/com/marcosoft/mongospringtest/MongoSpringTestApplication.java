package com.marcosoft.mongospringtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoSpringTestApplication {

    @Autowired
    private static LogMessageRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MongoSpringTestApplication.class, args);

        // save a couple of customers
       repository.save(new LogMessage("Alice", 12));
        //repository.save(new Log("Bob", 31));
    }

}
