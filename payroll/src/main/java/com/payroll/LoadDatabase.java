package com.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Will be loaded automatically by Spring
 * */
@Configuration
class LoadDatabase {

    private static final Logger log =  LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "security")));
            log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "security")));
            log.info("Preloading " + repository.save(new Employee("Sam" , "Taylor", "security")));
        };
    }
}
