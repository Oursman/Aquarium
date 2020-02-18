package fr.Aquarium.Model;

import javax.persistence.*;

@Entity
@Table(name="SECTEUR")
public class Secteur {
    @Id
    @GeneratedValue
    @Column(name="SECTEUR_ID")
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
