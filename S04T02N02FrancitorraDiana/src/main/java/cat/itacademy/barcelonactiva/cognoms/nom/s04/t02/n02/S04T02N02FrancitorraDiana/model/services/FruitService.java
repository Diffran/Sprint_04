package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02FrancitorraDiana.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.S04T02N02FrancitorraDiana.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit createFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void  deleteFruit(long fruitId);
    Fruit getOneFruit(long fruitId);
    List<Fruit> getAllFruits();
}
