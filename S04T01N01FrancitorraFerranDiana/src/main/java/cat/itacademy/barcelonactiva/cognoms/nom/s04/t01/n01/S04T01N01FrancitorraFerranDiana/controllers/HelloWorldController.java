package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01FrancitorraFerranDiana.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    public static final String DEFAULT_NAME="Unknown";
    @GetMapping("/saluda")
    public String saluda(@RequestParam(value="name", defaultValue=DEFAULT_NAME) String name){
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }

    @GetMapping({"/saluda2","/saluda2/{name}"})
    public String saluda2(@PathVariable(required=false)String name){
        return "Hola, " + (name != null ? name:DEFAULT_NAME) + ". Estàs executant un projecte Maven";
    }

}
