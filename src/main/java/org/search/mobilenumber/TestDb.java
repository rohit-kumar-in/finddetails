/*

        package org.search.mobilenumber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;

@Component
public class TestDb implements CommandLineRunner {

    private final EntityManager entityManager;

    public TestDb (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void run(String... args) {
        try {
            entityManager.createNativeQuery("SELECT 1").getSingleResult();
            System.out.println("✅ Supabase DB Connected!");
        } catch (Exception e) {
            System.out.println("❌ Connection Failed");
        }
    }
}

 */