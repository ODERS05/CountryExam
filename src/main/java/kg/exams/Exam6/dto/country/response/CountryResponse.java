package kg.exams.Exam6.dto.country.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryResponse {
    String name;

    String alphaCode;

    Long population;

    Boolean isActive;
}
