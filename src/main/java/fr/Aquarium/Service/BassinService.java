package fr.Aquarium.Service;

import fr.Aquarium.Model.Bassin;
import fr.Aquarium.Repository.BassinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BassinService {

    @Autowired
    private BassinRepository bassinRepository;
    @Transactional
    public void saveOrUpdate(Bassin bassin){
        bassinRepository.save(bassin);
    }
    public List<Bassin> getall(){
        return bassinRepository.findAll();
    }
    public void delete(Long id){
        bassinRepository.deleteById(id);
    }
}
