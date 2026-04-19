package org.search.mobilenumber.Repository;

import org.search.mobilenumber.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Finds a match if the query matches either email OR mobile
    List<Customer> findByEmailContainingOrMobileContaining(String email, String mobile);
}