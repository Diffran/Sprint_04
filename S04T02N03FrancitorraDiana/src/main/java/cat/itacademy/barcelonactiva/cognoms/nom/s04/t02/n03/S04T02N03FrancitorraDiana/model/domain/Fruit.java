package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.domain;

import jakarta.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="fruits")
public class Fruit {

    @Id
    private String id;
    private String name;
    private int kgQuantity;

    public Fruit(){

    }
    public Fruit(String name, int kgQuantity){
        this.name=name;
        this.kgQuantity=kgQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

