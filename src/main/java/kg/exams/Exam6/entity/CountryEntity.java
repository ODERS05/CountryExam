package kg.exams.Exam6.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "country")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryEntity extends BaseEntity{
    @Column(name = "name")
    String name;

    @Column(name = "alpha_code")
    String alphaCode;

    @Column(name = "population")
    Long population;

    @Column(name = "is_active")
    Boolean isActive;
}
