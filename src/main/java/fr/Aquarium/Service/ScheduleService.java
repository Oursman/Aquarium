package fr.Aquarium.Service;


import fr.Aquarium.Model.Espece;
import fr.Aquarium.Model.Schedule;
import fr.Aquarium.Repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;
    @Transactional
    public void saveOrUpdate(Schedule schedule){
        scheduleRepository.save(schedule);
    }
    public List<Schedule> getall(){
        return scheduleRepository.findAll();
    }
    public void delete(Long id){
        scheduleRepository.deleteById(id);
    }
}
