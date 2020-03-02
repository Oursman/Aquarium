package fr.Aquarium.Service;

import fr.Aquarium.Model.Schedule;
import fr.Aquarium.Model.Secteur;
import fr.Aquarium.Repository.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SecteurService {

    @Autowired
    private SecteurRepository secteurRepository;
    @Transactional
    public void saveOrUpdate(Secteur secteur){
        secteurRepository.save(secteur);
    }
    public List<Secteur> getall(){
        return secteurRepository.findAll();
    }
    public void delete(Long id){
        secteurRepository.deleteById(id);
    }

}
