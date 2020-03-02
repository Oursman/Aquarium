package fr.Aquarium.Repository;

import fr.Aquarium.Model.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurRepository extends JpaRepository<Secteur, Long> {
    Secteur findByName(String name);

}
