package fr.Aquarium.Service;

import fr.Aquarium.Model.Animal;
import fr.Aquarium.Repository.AnimalRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void saveOrUpdate(Animal animal){
        animalRepository.save(animal);
    }
    public void delete(Animal animal){
        animalRepository.delete(animal);
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

}
