package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.controllers;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.S04T02N03FrancitorraDiana.model.services.impl.FruitServiceImpl;
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
    private FruitServiceImpl fruitServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<?> addFruit(@RequestBody Fruit fruit){
        return ResponseEntity.status(HttpStatus.CREATED).body(fruitServiceImpl.createFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(fruitServiceImpl.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFruit(@PathVariable("id") String fruitId){
        fruitServiceImpl.deleteFruit(fruitId);
       return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<?> getOneFruit(@PathVariable("id") String fruitId){
        return ResponseEntity.ok().body(fruitServiceImpl.getOneFruit(fruitId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        return ResponseEntity.ok().body(fruitServiceImpl.getAllFruits());
    }

}

