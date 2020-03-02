package fr.Aquarium.Service;

import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Model.Espece;
import fr.Aquarium.Repository.EspeceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EspeceService {

    @Autowired
    private EspeceRepository especeRepository;
    @Transactional
    public void saveOrUpdate(Espece espece){
        especeRepository.save(espece);
    }
    public List<Espece> getall(){
        return especeRepository.findAll();
    }
    public void delete(Long id){
        especeRepository.deleteById(id);
    }

}
