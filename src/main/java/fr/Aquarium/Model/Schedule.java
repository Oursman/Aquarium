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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASSIN_ID", nullable = false)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bassin getBassin() {
        return bassin;
    }

    public void setBassin(Bassin bassin) {
        this.bassin = bassin;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getStartActivity() {
        return startActivity;
    }

    public void setStartActivity(Date startActivity) {
        this.startActivity = startActivity;
    }

    public Date getEndActivity() {
        return endActivity;
    }

    public void setEndActivity(Date endActivity) {
        this.endActivity = endActivity;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
