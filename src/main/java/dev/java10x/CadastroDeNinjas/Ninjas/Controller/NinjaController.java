package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/")
    public String boasVindas(){
        return "Bem vindo!";
    }

 // TODO:    @GetMapping("/ID DO NINJA/missoes") listar todas missoes dele
 // TODO:    @GetMapping("/ID DO NINJA/missoes/codigo da missao ") listar uma missao
}
