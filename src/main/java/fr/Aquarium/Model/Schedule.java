package fr.Aquarium.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="SCHEDULE")
public class Schedule {
    @Id
    @GeneratedValue
    @Column(name="SCHEDULE_ID")
    private int id;
    @Column(name="SCHEDULE_ID")
    private Bassin bassin;
    @Column(name="SCHEDULE_ACTIVITY")
    private String activity;
    @Column(name="SCHEDULE_STATACTIVITY")
    private Date startActivity;
    @Column(name="SCHEDULE_ENDACTIVITY")
    private Date endActivity;
    @Column(name="SCHEDULE_OPEN")
    private boolean open;

    public Schedule() {
        super();
    }

    public Schedule(Bassin bassin, String activity, Date startActivity, Date endActivity) {
        this.bassin = bassin;
        this.activity = activity;
        this.startActivity= startActivity;
        this.endActivity= endActivity;
    }
}
