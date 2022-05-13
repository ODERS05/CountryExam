package kg.exams.Exam6.dto.endpointLog.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReportEndpointLogResponse {
    Long count;

    List<EndpointLogResponse> endpointResponses;
}