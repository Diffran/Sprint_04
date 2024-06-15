package cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "Fruit")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="fruit")
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

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kgQuantity=" + kgQuantity +
                '}';
    }
}
