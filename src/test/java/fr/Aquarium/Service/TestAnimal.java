package fr.Aquarium.Service;


import fr.Aquarium.AquariumApplication;
import fr.Aquarium.Model.Animal;
import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Model.Espece;
import fr.Aquarium.Model.Secteur;
import fr.Aquarium.Repository.AnimalRepository;
import fr.Aquarium.Repository.BassinRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class TestAnimal {

    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private BassinRepository bassinRepository;
    @Autowired
    private TestEntityManager testEntityManager;

    @Before
    public void setUp(){
        Espece espece = new Espece("viande",new Date(), "vindo",1);
        testEntityManager.persist(espece);
        Bassin bassin = new Bassin(100,0,false,null);
        testEntityManager.persist(bassin);
        Animal animal = new Animal("ours","M","grand",new Date(),new Date(),bassin,espece);
        testEntityManager.persist(animal);
    }
    @Test
    public void getall(){
        animalRepository.save(new Animal("Lapin","M","grand",new Date(),new Date(),null,null));
        List<Animal> lst = animalRepository.findAll();
        assertEquals(2, lst.size());
    }
    @Test
    public void getByBassin(){
        long id = bassinRepository.findAll().get(0).getId();
        assertEquals(1, animalRepository.findAnimalByBassinid(id).size());

    }
    @Test
    public void getByEspece(){
        assertEquals(1, animalRepository.findAnimalByEspeceName("viande").size());

    }

}
