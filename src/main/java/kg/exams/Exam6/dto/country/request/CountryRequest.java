package kg.exams.Exam6.dto.country.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryRequest {
    String name;

    String alphaCode;

    Long population;

    Boolean isActive;
}
