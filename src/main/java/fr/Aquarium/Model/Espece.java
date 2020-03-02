package fr.Aquarium.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="ESPECE")

public class Espece implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ESPECE_ID")
    private Long id;

    @Column(name="ESPECE_NAME")
    private String name;

    @Column(name="ESPECE_DATE")
    private Date esperanceDate;

    @Column(name="ESPECE_REGIME")
    private String  regime;

    @Column(name="ESPECE_MENACE")
    private int menacer;

    public Espece() {
        super();
    }

    public Espece(String name, Date esperanceDate, String regime, int menacer) {
        this.name = name;
        this.esperanceDate = esperanceDate;
        this.menacer = menacer;
        this.regime = regime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
