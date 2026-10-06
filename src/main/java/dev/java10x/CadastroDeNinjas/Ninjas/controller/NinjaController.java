package dev.java10x.CadastroDeNinjas.Ninjas.controller;

import dev.java10x.CadastroDeNinjas.Ninjas.dto.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping("/adicionar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.adicionarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaDTO> mostrarTodosNinjas(){
        return ninjaService.mostrarTodosNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaDTO mostrarTodosNinjasPorId(@PathVariable Long id){
        return ninjaService.mostrarNinjaPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarNinjaPorId(@PathVariable Long id,@RequestBody NinjaDTO ninja) {
        return ninjaService.alterarNinja(id, ninja);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }

 // TODO:    @GetMapping("/ID DO NINJA/missoes") listar todas missoes dele
 // TODO:    @GetMapping("/ID DO NINJA/missoes/codigo da missao ") listar uma missao
}
