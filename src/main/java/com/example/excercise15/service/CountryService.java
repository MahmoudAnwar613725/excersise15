package com.example.excercise15.service;

 import com.example.excercise15.domain.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();

    Country update(Country country);
}
