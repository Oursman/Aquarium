package fr.Aquarium.Repository;

import fr.Aquarium.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByNom(@Param("name") String name);


   @Query("SELECT a FROM Animal a join a.bassin b where b.id = :idBassin ")
    List<Animal> findAnimalByBassinid(@Param("idBassin") Long idBassin);

    @Query("SELECT a FROM Animal a join a.espece e where e.name = :name ")
    List<Animal> findAnimalByEspeceName(@Param("name") String name);
}
