package org.search.mobilenumber.Controller;


import org.search.mobilenumber.Entity.Customer;
import org.search.mobilenumber.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private CustomerRepository repository;
    /*
    @GetMapping("/search")
    public String handleSearch(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        List<Customer> results;

        if (keyword != null && !keyword.isEmpty()) {
            // We pass the same keyword to both fields
            results = repository.findByEmailContainingOrMobileContaining(keyword, keyword);
        } else {
            results = repository.findAll();
        }

        model.addAttribute("results", results);
        return "search-page"; // This is your HTML file
    }
    */
    @GetMapping("/")
    public String handleSearch(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        List<Customer> results;

        // FOR DEBUGGING: Let's see everything first
        List<Customer> allData = repository.findAll();
        System.out.println("--- DEBUG LOG ---");
        System.out.println("Total records found in Supabase: " + allData.size());

        if (keyword != null && !keyword.isEmpty()) {
            results = repository.findByEmailContainingOrMobileContaining(keyword, keyword);
            System.out.println("Search results for '" + keyword + "': " + results.size());
        } else {
            results = allData;
        }

        System.out.println("-----------------");

        model.addAttribute("results", results);
        return "search-page";
    }
}
