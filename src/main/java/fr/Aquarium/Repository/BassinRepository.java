package fr.Aquarium.Repository;

import fr.Aquarium.Model.Bassin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BassinRepository extends JpaRepository<Bassin, Long> {
    @Query("SELECT b FROM Bassin b join b.secteur s where s.name = :name ")
    List<Bassin> findBassinBySecteurName(@Param("name")String name);
}
