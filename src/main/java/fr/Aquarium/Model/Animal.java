package fr.Aquarium.Model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="ANIMAL")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="ANIMAL_NOM", nullable = false)
    private String nom;

    @Column(name="ANIMAL_SEXE", nullable = false)
    private String sexe;

    @Column(name="ANIMAL_SIGNEDISTINCTIF", nullable = false)
    private String signeDistinctif;

    @Column(name="ANIMAL_STARTDATE", nullable = false)
    private Date startDate;

    @Column(name="ANIMAL_ENDDATE")
    private Date endDate;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(targetEntity = Bassin.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "BASSIN_ID", referencedColumnName = "BASSIN_ID")
    private Bassin bassin;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(targetEntity = Espece.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "ESPECE_ID", referencedColumnName = "ESPECE_ID")
    private Espece espece;

    public Animal() {
        super();
    }

    public Animal(String nom, String sexe, String signeDistinctif, Date startDate, Date endDate, Bassin bassin, Espece espece) {
        this.nom=nom;
        this.sexe = sexe;
        this.signeDistinctif=signeDistinctif;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bassin = bassin;
        this.espece = espece;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Espece getEspece() {
        return espece;
    }

    public void setEspece(Espece espece) {
        this.espece = espece;
    }
}
