package dev.java10x.CadastroDeNinjas.Missoes.service;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import dev.java10x.CadastroDeNinjas.Missoes.repository.MissoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    @Autowired
    private MissoesRepository repository;

    public List<MissaoModel> listarTodasMissoes(){
        return repository.findAll();
    }

}
