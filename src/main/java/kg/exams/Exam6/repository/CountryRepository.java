package kg.exams.Exam6.repository;

import kg.exams.Exam6.dto.country.response.CountryResponse;
import kg.exams.Exam6.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity,Long>{
    @Query(nativeQuery = true, value = "select * from country c where name like :name")
    List<CountryEntity> searchByName(String name);

    @Query(nativeQuery = true,value = "update country s set is_active =false where s.id =:id")
    CountryResponse isActive(Long id);
}
