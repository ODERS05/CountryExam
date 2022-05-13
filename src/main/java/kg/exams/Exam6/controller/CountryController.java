package kg.exams.Exam6.controller;

import kg.exams.Exam6.dto.country.request.CountryRequest;
import kg.exams.Exam6.dto.country.response.CountryResponse;
import kg.exams.Exam6.dto.endpointLog.response.ReportEndpointLogResponse;
import kg.exams.Exam6.repository.EndpointLogRepository;
import kg.exams.Exam6.service.CountryService;
import kg.exams.Exam6.service.EndpointLogService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/country")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryController {
    final CountryService countryService;
    final EndpointLogService endpointLogService;
    final EndpointLogRepository endpointLogRepository;

    @PostMapping
    public CountryResponse save(@RequestBody CountryRequest request) {
        return countryService.save(request);
    }

    @DeleteMapping("{id-country}")
    public Boolean deleteById(@PathVariable("id-country") Long id) {
        return countryService.delete(id);
    }

    @GetMapping("{id}")
    public CountryResponse getById(@PathVariable("id") Long id) {
        return countryService.getCountryById(id);
    }

    @GetMapping
    public List<CountryResponse> getAll() {
        return countryService.getAllCountry();
    }

    @PostMapping("/search")
    public List<CountryResponse> search(String name){
        return countryService.searchByCountryName(name);
    }

    @GetMapping("/report-all")
    public ReportEndpointLogResponse report(String endpoint){
        return endpointLogService.getAllLog(endpoint);
    }
}
