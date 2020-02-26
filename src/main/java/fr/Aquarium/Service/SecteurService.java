package fr.Aquarium.Service;

import fr.Aquarium.Repository.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecteurService {

    @Autowired
    private SecteurRepository secteurRepository;


}
