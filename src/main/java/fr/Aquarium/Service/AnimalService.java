package fr.Aquarium.Service;

import fr.Aquarium.Model.Animal;
import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Repository.AnimalRepository;
import fr.Aquarium.Repository.BassinRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private BassinRepository bassinRepository;

    @Transactional
    public Animal saveOrUpdate(Animal animal){
        return animalRepository.save(animal);
    }
    public void delete(Long id){
        animalRepository.deleteById(id);
    }
    public List<Animal> getAll(){
        return animalRepository.findAll();
    }
    public List<Animal> getAnimalByName(String name){
       return animalRepository.findByNom(name);
    }
    public List<Animal> getAnimalByBassin(Long idBassin){
        return animalRepository.findAnimalByBassinid(idBassin);
    }
    public List<Animal> getAnimalBySecteur(String  name){
        List<Bassin> lstbassin = bassinRepository.findBassinBySecteurName(name);
        List<Animal> lstanimal = new ArrayList<>();
        for (Bassin b :lstbassin) {
            lstanimal.addAll(getAnimalByBassin(b.getId()));
        }
        return lstanimal;
    }
    public List<Animal> getAnimalByEspece(String name){
        return animalRepository.findAnimalByEspeceName(name);
    }

}
