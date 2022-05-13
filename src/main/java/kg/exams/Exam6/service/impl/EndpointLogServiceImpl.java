package kg.exams.Exam6.service.impl;

import kg.exams.Exam6.dto.endpointLog.response.ReportEndpointLogResponse;
import kg.exams.Exam6.entity.EndpointLogEntity;
import kg.exams.Exam6.repository.EndpointLogRepository;
import kg.exams.Exam6.service.EndpointLogService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class EndpointLogServiceImpl implements EndpointLogService {
    final EndpointLogRepository repository;

    @Override
    public Long getContLogs(String endpoint) {
        return repository.countAllByEndpoint(endpoint);
    }

    @Override
    public ReportEndpointLogResponse getAllLog(String endpoint) {
        List<EndpointLogEntity> endpointLogEntities = repository.findByEndpoint(endpoint);
        return ReportEndpointLogResponse.builder()
                .count(getContLogs(endpoint))
                .build();
    }
}
