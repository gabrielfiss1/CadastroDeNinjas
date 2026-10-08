package dev.java10x.CadastroDeNinjas.Missoes.controller;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import dev.java10x.CadastroDeNinjas.Missoes.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes") // mapear api
public class MissoesController {

    @Autowired
    private MissaoService service;

    @GetMapping("/listar")
    public List<MissaoModel> todasMissoes(){
        return service.listarTodasMissoes();
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarMissao(@RequestBody MissaoModel missao) {
        MissaoModel novaMissao = service.criarMissao(missao);
        return ResponseEntity.ok("Missão criada com sucesso! " + "ID: " + novaMissao.getId());
    }

    @PutMapping("/alterar")
        public String alterarMissao(){
            return "alterar missao";
        }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "deletar missao";
    }
}
