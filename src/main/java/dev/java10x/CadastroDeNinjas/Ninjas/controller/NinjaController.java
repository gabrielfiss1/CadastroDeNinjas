package dev.java10x.CadastroDeNinjas.Ninjas.controller;

import dev.java10x.CadastroDeNinjas.Ninjas.dto.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping("/adicionar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja = ninjaService.adicionarNinja(ninja);
        return ResponseEntity.created(null).body("Ninja criado com sucesso! " + "ID: " + novoNinja.getId());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> mostrarTodosNinjas(){
        List<NinjaDTO> ninjas = ninjaService.mostrarTodosNinjas();
        return ResponseEntity.ok(ninjas);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> mostrarTodosNinjasPorId(@PathVariable Long id){
        NinjaDTO ninja = buscarNinjaPorId(id);
        return ResponseEntity.ok(ninja);
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id,@RequestBody NinjaDTO ninja) {
        buscarNinjaPorId(id);
        NinjaDTO ninjaAlterado = ninjaService.alterarNinja(id, ninja);
        return ResponseEntity.ok(ninjaAlterado);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id){
        buscarNinjaPorId(id);
        ninjaService.deletarNinja(id);
        return ResponseEntity.ok("Ninja deletado com sucesso! " + id);
    }

    private NinjaDTO buscarNinjaPorId(Long id) {
        NinjaDTO ninja = ninjaService.mostrarNinjaPorId(id);
        if (ninja == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ninja não encontrado com o id " + id);
        }
        return ninja;
    }

 // TODO:    @GetMapping("/ID DO NINJA/missoes") listar todas missoes dele
 // TODO:    @GetMapping("/ID DO NINJA/missoes/codigo da missao ") listar uma missao
}
