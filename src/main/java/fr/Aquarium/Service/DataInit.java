package fr.Aquarium.Service;

import fr.Aquarium.Model.Animal;
import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Model.Espece;
import fr.Aquarium.Model.Secteur;
import fr.Aquarium.Repository.AnimalRepository;
import fr.Aquarium.Repository.BassinRepository;
import fr.Aquarium.Repository.EspeceRepository;
import fr.Aquarium.Repository.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataInit  implements ApplicationRunner {

    private AnimalRepository animalRepository;
    private BassinRepository bassinRepository;
    private SecteurRepository secteurRepository;
    private EspeceRepository especeRepository;
    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");


    @Autowired
    public DataInit(AnimalRepository animalRepository,BassinRepository bassinRepository,SecteurRepository secteurRepository,EspeceRepository especeRepository) {
        this.animalRepository=animalRepository;
        this.bassinRepository=bassinRepository;
        this.secteurRepository=secteurRepository;
        this.especeRepository =especeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Espece espece = new Espece("Mamifaire",df.parse("1980-12-20"), "Viande",1);
        Espece espece1 = new Espece("Oiseau",df.parse("1980-12-20"), "Vegetarien",1);
        Espece espece2 = new Espece("Poisson",df.parse("1980-12-20"), "Vegetarien",1);
        Espece espece3 = new Espece("Vertébré",df.parse("1980-12-20"), "Carnivore",1);
        Espece espece4 = new Espece("Mollusque",df.parse("1980-12-20"), "Vegetarien",1);
        especeRepository.save(espece);
        especeRepository.save(espece1);
        especeRepository.save(espece2);
        especeRepository.save(espece3);
        especeRepository.save(espece4);

        Secteur secteur = new Secteur("Foret", 1);
        Secteur secteur1 = new Secteur("Eau", 2);
        secteurRepository.save(secteur);
        secteurRepository.save(secteur1);

        Bassin bassin = new Bassin(10,0,false,secteur);
        Bassin bassin1 = new Bassin(20,20,false,secteur);
        Bassin bassin2 = new Bassin(20,100,false,secteur1);
        bassinRepository.save(bassin);
        bassinRepository.save(bassin1);
        bassinRepository.save(bassin2);

        Animal animal = new Animal("Oursaring","M","grand",df.parse("1980-12-20"),null,bassin,espece);
        Animal animal1 = new Animal("Roucarnage","M","grand",df.parse("1980-12-20"),null,bassin,espece);
        Animal animal2 = new Animal("Hipporoy","F","grand",df.parse("1980-12-20"),null,bassin2,espece);
        Animal animal3 = new Animal("Bulbizar","F","grand",df.parse("1980-12-20"),null,bassin1,espece);
        Animal animal4 = new Animal("Papillusion","F","grand",df.parse("1980-12-20"),null,bassin1,espece);
        animalRepository.save(animal);
        animalRepository.save(animal1);
        animalRepository.save(animal2);
        animalRepository.save(animal3);
        animalRepository.save(animal4);

    }
}
