package be.thomasmore.flippin.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import be.thomasmore.flippin.model.Industry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IndustryRepository extends CrudRepository<Industry, Integer> {
    Optional<Industry> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Industry> findFirstByIdGreaterThanOrderById(int id);

    Optional<Industry> findFirstByOrderByIdDesc();
    Optional<Industry> findFirstByOrderByIdAsc();

    List<Industry> findAll();

    @Query("SELECT i FROM Industry i WHERE :word IS NULL OR LOWER(i.industryName) LIKE LOWER(CONCAT('%',:word,'%'))")
    List<Industry> findByKeyword(@Param("word") String word);
}
