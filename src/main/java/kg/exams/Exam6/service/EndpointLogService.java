package kg.exams.Exam6.service;

import kg.exams.Exam6.dto.endpointLog.response.ReportEndpointLogResponse;

public interface EndpointLogService {
    Long getContLogs(String endpoint);

    ReportEndpointLogResponse getAllLog(String endpoint);
}
