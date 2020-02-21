package fr.Aquarium.Repository;

import fr.Aquarium.Model.Bassin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BassinRepository extends JpaRepository<Bassin, Long> {
}
