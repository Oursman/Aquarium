package fr.Aquarium.Controller;

import fr.Aquarium.Model.Animal;
import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/ViewsAnimal")
    public List<Animal> getUsers() {
        return animalService.getAll();
    }

    @PostMapping("/AddAnimal")
    public void addAnimal(@RequestBody Animal animal) {
        animalService.saveOrUpdate(animal);
    }

    @GetMapping("/ViewsAnimalByBassin/{id}")
    public List<Animal> getBassin(@PathVariable long id) {
        return animalService.getAnimalByBassin(id);
    }

    @DeleteMapping("/DeleteAnimal/{id}")
    public void delete(@PathVariable Long id) {
        animalService.delete(id);
    }
}
