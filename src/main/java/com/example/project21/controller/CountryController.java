package com.example.project21.controller;

import com.example.project21.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    /*@GetMapping("/france")
    public Country france(){
        Country country = Country.of("France", 67);
        return country;
    }

    @GetMapping("/all")
    public List<Country> countries() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);
        return List.of(c1, c2);
    }*/

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country country = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("food", "cheese and wine")
                .body(country);
    }

}
