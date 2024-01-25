package org.sid.customerfrontthymeleaf;

import org.sid.customerfrontthymeleaf.entities.Customer;
import org.sid.customerfrontthymeleaf.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafApplication.class, args);
    }
    @Bean

    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args ->{
            customerRepository.save(Customer.builder().name("Aymene").email("med@gmail.com").build());
            customerRepository.save(Customer.builder().name("Hamid").email("Hamid@gmail.com").build());
            customerRepository.save(Customer.builder().name("Hanae").email("Hanae@gmail.com").build());
        };
    }

}
