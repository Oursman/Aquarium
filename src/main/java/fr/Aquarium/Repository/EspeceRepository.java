package fr.Aquarium.Repository;

import fr.Aquarium.Model.Espece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspeceRepository extends JpaRepository<Espece, Long> {
}
