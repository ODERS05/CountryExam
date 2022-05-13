package kg.exams.Exam6.mapper;

import kg.exams.Exam6.dto.country.response.CountryResponse;
import kg.exams.Exam6.entity.CountryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryResponse toCountryResponseDto(CountryEntity country);
    CountryEntity toCountryEntity(CountryResponse countryResponse);
    List<CountryResponse> toCountriesResponseDto(List<CountryEntity> countryEntities);
}
