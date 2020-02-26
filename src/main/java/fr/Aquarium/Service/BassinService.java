package fr.Aquarium.Service;

import fr.Aquarium.Repository.BassinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BassinService {

    @Autowired
    private BassinRepository bassinRepository;
}
