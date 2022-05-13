package kg.exams.Exam6.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "endpoint_log")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EndpointLogEntity extends BaseEntity{

    @Column(name = "endpoint")
    String endpoint;
}
