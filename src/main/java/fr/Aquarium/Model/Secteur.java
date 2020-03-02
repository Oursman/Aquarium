package fr.Aquarium.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="SECTEUR")
public class Secteur implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="SECTEUR_ID")
    private Long id;

    @Column(name="SECTEUR_NAME")
    private String name;

    @Column(name="SECTEUR_LOCALISATION")
    private int localisation;

    public Secteur() {
        super();
    }

    public Secteur(String name , int localisation) {
        this.name = name;
        this.localisation = localisation;
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

    public int getLocalisation() {
        return localisation;
    }

    public void setLocalisation(int localisation) {
        this.localisation = localisation;
    }
}
