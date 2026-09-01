package dev.java10x.CadastroDeNinjas.Ninjas.service;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository repository;

    // listar todos ninjas
    public List<NinjaModel> mostrarTodosNinjas(){
       return repository.findAll();
    }

    public Optional<NinjaModel> mostrarNinjaPorId(Long id){
        return repository.findById(id);
    }

    public NinjaModel adicionarNinja(NinjaModel ninja){
        return repository.save(ninja);
    }

    public void deletarNinja(Long id){
           repository.deleteById(id);
    }
}
