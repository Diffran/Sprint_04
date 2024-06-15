package cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.repository;

import cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IFruitRepository extends JpaRepository<Fruit, Long> {
    Optional<Fruit> findByName(String name);
}
