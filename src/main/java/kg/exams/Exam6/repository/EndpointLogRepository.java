package kg.exams.Exam6.repository;


import kg.exams.Exam6.entity.EndpointLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EndpointLogRepository extends JpaRepository<EndpointLogEntity,Long> {

    List<EndpointLogEntity> findByEndpoint(String name);

    Long countAllByEndpoint(String endpoint);
}