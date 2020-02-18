package fr.Aquarium.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ESPECE")

public class Espece {
    @Id
    @GeneratedValue
    @Column(name="ESPECE_ID")
    private int id;

    @Column(name="ESPECE_DATE")
    private Date esperanceDate;

    @Column(name="ESPECE_REGIME")
    private String  regime;

    @Column(name="ESPECE_MENACE")
    private int menacer;

    public Espece() {
        super();
    }

    public Espece(Date esperanceDate, String regime, int menacer) {
        this.esperanceDate = esperanceDate;
        this.menacer = menacer;
        this.regime = regime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEsperanceDate() {
        return esperanceDate;
    }

    public void setEsperanceDate(Date esperanceDate) {
        this.esperanceDate = esperanceDate;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public int getMenacer() {
        return menacer;
    }

    public void setMenacer(int menacer) {
        this.menacer = menacer;
    }
}
