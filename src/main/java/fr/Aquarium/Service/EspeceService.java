package fr.Aquarium.Service;

import fr.Aquarium.Repository.EspeceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspeceService {

    @Autowired
    private EspeceRepository especeRepository;
}
