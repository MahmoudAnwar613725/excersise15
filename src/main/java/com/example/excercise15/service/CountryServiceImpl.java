package com.example.excercise15.service;

  import com.example.excercise15.domain.Country;
import com.example.excercise15.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
  import org.springframework.web.bind.annotation.RequestBody;

  import java.util.List;


@Service
@Transactional
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country update(Country country) {
     return    countryRepository.save(country);

    }
}
