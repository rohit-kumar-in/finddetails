package org.search.mobilenumber.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Table(name = "customers")
@Table(name = "\"customers\"", schema = "public")
@Data // Lombok: generates getters, setters, toString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String mobile;

    @Column(unique = true)
    private String email;
}