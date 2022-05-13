package kg.exams.Exam6.dto.endpointLog.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EndpointLogResponse {

    String endpoint;

    LocalDateTime requestTime;
}
