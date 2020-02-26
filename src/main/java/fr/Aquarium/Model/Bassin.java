package fr.Aquarium.Model;


import javax.persistence.*;

@Entity
@Table(name="BASSIN")
public class Bassin {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="BASSIN_ID")
    private int id;

    @Column(name="BASSIN_MAXCAPACITY")
    private int maxCapacity;

    @Column(name="BASSIN_VOLUMEWATER")
    private int volumeWater;

    @Column(name="BASSIN_SALE")
    private Boolean sale;

    @ManyToOne(targetEntity = Secteur.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "SECTEUR_ID", referencedColumnName = "SECTEUR_ID")
    private Secteur secteur;

    public Bassin() {
        super();
    }

    public Bassin(int maxCapacity, int volumeWater, Boolean sale, Secteur secteur) {
        this.maxCapacity=maxCapacity;
        this.volumeWater =volumeWater;
        this.sale = sale;
        this.secteur = secteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getVolumeWater() {
        return volumeWater;
    }

    public void setVolumeWater(int volumeWater) {
        this.volumeWater = volumeWater;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
}
