package fr.Aquarium.Controller;

import fr.Aquarium.Model.Espece;
import fr.Aquarium.Service.EspeceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EspeceController {
    @Autowired
    private EspeceService especeService;

    @GetMapping("/ViewsEspece")
    public List<Espece> getUsers() {
        return especeService.getall();
    }

    @PostMapping("/AddEspece")
    public void addAnimal(@RequestBody Espece espece) {
        especeService.saveOrUpdate(espece);
    }

    @DeleteMapping("/DeleteEspece/{id}")
    public void delete(@PathVariable Long id) {
        especeService.delete(id);
    }
}
