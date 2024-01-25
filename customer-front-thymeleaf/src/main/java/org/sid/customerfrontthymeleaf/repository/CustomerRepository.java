package org.sid.customerfrontthymeleaf.repository;

import org.sid.customerfrontthymeleaf.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
