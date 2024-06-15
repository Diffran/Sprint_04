package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02FrancitorraDiana.model.domain;

import jakarta.persistence.*;


@Entity
@Table(name="fruites")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idfruit")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="kg")
    private int kgQuantity;

    public Fruit(){

    }
    public Fruit(String name, int kgQuantity){
        this.name=name;
        this.kgQuantity=kgQuantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKgQuantity() {
        return kgQuantity;
    }

    public void setKgQuantity(int kgQuantity) {
        this.kgQuantity = kgQuantity;
    }

}

