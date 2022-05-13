package kg.exams.Exam6.service.impl;

import kg.exams.Exam6.dto.country.request.CountryRequest;
import kg.exams.Exam6.dto.country.response.CountryResponse;
import kg.exams.Exam6.entity.CountryEntity;
import kg.exams.Exam6.exceptions.CountryNotFoundException;
import kg.exams.Exam6.exceptions.CountryRequestNullException;
import kg.exams.Exam6.mapper.CountryMapper;
import kg.exams.Exam6.repository.CountryRepository;
import kg.exams.Exam6.service.CountryService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    final CountryRepository countryRepository;

    @Override
    public CountryResponse save(CountryRequest countryRequest) {
        if (countryRequest == null){
            throw new CountryRequestNullException("Create country is null");
        }

        CountryEntity country = countryRepository.save(CountryEntity.builder()
                .name(countryRequest.getName())
                .alphaCode(countryRequest.getAlphaCode())
                .population(countryRequest.getPopulation())
                .isActive(true)
                .build());
        return CountryMapper.INSTANCE.toCountryResponseDto(country);
    }

    @Override
    public List<CountryResponse> getAllCountry(){
        return CountryMapper.INSTANCE.toCountriesResponseDto(countryRepository.findAll());
    }

    @Override
    public CountryResponse getCountryById(Long id) {
        if (id == null) {
            throw new InvalidParameterException("Id is null");
        }
        CountryEntity country = countryRepository.getById(id);
        return CountryMapper.INSTANCE.toCountryResponseDto(country);
    }

    @Override
    public Boolean delete(Long id) {
        CountryEntity countryEntity = countryRepository.getById(id);
        if (countryEntity != null) {
            countryRepository.isActive(countryEntity.getId());
            return true;
        }
        return false;
    }


    @Override
    public List<CountryResponse> searchByCountryName(String name){
        if (Strings.isBlank(name)){
            throw new InvalidParameterException("country name is blank");
        }
        List<CountryEntity> countryEntities = countryRepository.searchByName(name);
        return CountryMapper.INSTANCE.toCountriesResponseDto(countryEntities);
    }
}
