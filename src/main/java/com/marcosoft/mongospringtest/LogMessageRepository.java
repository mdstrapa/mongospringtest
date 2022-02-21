package com.marcosoft.mongospringtest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogMessageRepository extends MongoRepository<LogMessage, String> {

    public LogMessage findByMessage(String message);
}
