package kg.exams.Exam6.service;

import kg.exams.Exam6.dto.country.request.CountryRequest;
import kg.exams.Exam6.dto.country.response.CountryResponse;

import java.util.List;

public interface CountryService{
    CountryResponse save(CountryRequest t);
    List<CountryResponse> getAllCountry();
    CountryResponse getCountryById(Long id);
    Boolean delete(Long id);
    List<CountryResponse> searchByCountryName(String name);
}