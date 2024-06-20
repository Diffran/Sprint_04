package cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.controllers;

import cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.domain.Fruit;
import cat.itacademy.barcelonactiva.francitorra.diana.s04.t02.n01.S04T02N01FrancitorraDiana.model.services.impl.FruitServiceImpl;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fruits")
public class FruitController {
    @Autowired
    private FruitServiceImpl fruitService;

    @PostMapping("/add")
    public ResponseEntity<?> addFruit(@RequestBody Fruit fruit){
        return ResponseEntity.status(HttpStatus.CREATED).body(fruitService.createFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(fruitService.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFruit(@PathVariable("id") Long fruitId){
        fruitService.deleteFruit(fruitId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<?> getOneFruit(@PathVariable("id") Long fruitId){
        return ResponseEntity.ok().body(fruitService.getOneFruit(fruitId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        return ResponseEntity.ok().body(fruitService.getAllFruits());
    }

}
