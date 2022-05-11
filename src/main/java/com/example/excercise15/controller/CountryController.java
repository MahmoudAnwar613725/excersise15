package com.example.excercise15.controller;

  import com.example.excercise15.domain.Country;
  import com.example.excercise15.service.CountryService;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PutMapping;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(value = "/countries")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @PutMapping(value = "/countries")
    public void updateCountry(@RequestBody Country country) {
         countryService.update(country);
    }
}
