package fr.Aquarium.Model;



import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name="ANIMAL")
public class Animal {
    @Id
    @GeneratedValue
    @Column(name="ANIMAL_ID", nullable = false)
    private int id;
    
    @Column(name="ANIMAL_NOM", nullable = false)
    private String nom;
    @Column(name="ANIMAL_SEXE", nullable = false)
    private String sexe;
    @Column(name="ANIMAL_SIGNEDISTINCTIF", nullable = false)
    private String signeDistinctif;
    @Column(name="ANIMAL_STARTDATE", nullable = false)
    private Date startDate;
    @Column(name="ANIMAL_ENDDATE", nullable = false)
    private Date endDate;

    public Animal() {
    }
}
