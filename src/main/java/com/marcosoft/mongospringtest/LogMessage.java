package com.marcosoft.mongospringtest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "LogMessages")
public class LogMessage {
    @Id
    public String id;
    private String message;
    private int affectedUsers;

    public LogMessage(){};
    public LogMessage(String message, int affectedUsers){
        this.message = message;
        this.affectedUsers = affectedUsers;
    }
}
