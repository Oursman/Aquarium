package fr.Aquarium.Controller;

import fr.Aquarium.Model.Animal;
import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Service.BassinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BassinController {

    @Autowired
    private BassinService bassinService;

    @GetMapping("/ViewsBassin")
    public List<Bassin> getUsers() {
        return bassinService.getall();
    }

    @PostMapping("/AddBassin")
    public void addAnimal(@RequestBody Bassin bassin) {
        bassinService.saveOrUpdate(bassin);
    }

    @DeleteMapping("/DeleteBassin/{id}")
    public void delete(@PathVariable Long id) {
        bassinService.delete(id);
    }

}
