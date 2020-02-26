package fr.Aquarium.Model;



import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name="ANIMAL")
public class Animal {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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

    @ManyToOne(targetEntity = Bassin.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "BASSIN_ID", referencedColumnName = "BASSIN_ID")
    private Bassin bassin;

    public Animal() {
        super();
    }

    public Animal(String nom, String sexe, String signeDistinctif, Date startDate, Date endDate) {
        this.nom=nom;
        this.sexe = sexe;
        this.signeDistinctif=signeDistinctif;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSigneDistinctif() {
        return signeDistinctif;
    }

    public void setSigneDistinctif(String signeDistinctif) {
        this.signeDistinctif = signeDistinctif;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Bassin getBassin() {
        return bassin;
    }

    public void setBassin(Bassin bassin) {
        this.bassin = bassin;
    }
}
