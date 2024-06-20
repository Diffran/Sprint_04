package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit createFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void  deleteFruit(String fruitId);
    Fruit getOneFruit(String fruitId);
    List<Fruit> getAllFruits();
}
