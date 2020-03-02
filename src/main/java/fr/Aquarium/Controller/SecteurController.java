package fr.Aquarium.Controller;

import fr.Aquarium.Model.Secteur;
import fr.Aquarium.Service.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SecteurController {
    @Autowired
    private SecteurService secteurService;

    @GetMapping("/ViewsSecteur")
    public List<Secteur> getUsers() {
        return secteurService.getall();
    }

    @PostMapping("/AddSecteur")
    public void addAnimal(@RequestBody Secteur secteur) {
        secteurService.saveOrUpdate(secteur);
    }

    @DeleteMapping("/DeleteSecteur/{id}")
    public void delete(@PathVariable Long id) {
        secteurService.delete(id);
    }
}
