package cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.services;

import cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit createFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void  deleteFruit(long fruitId);
    Fruit getOneFruit(long fruitId);
    List<Fruit> getAllFruits();
}
