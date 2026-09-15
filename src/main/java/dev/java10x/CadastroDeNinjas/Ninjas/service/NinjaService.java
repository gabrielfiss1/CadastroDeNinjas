package dev.java10x.CadastroDeNinjas.Ninjas.service;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.dto.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.mapper.NinjaMapper;
import dev.java10x.CadastroDeNinjas.Ninjas.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository repository;
    @Autowired
    private NinjaMapper mapper;

    // listar todos ninjas
    public List<NinjaModel> mostrarTodosNinjas(){
       return repository.findAll();
    }

    public Optional<NinjaModel> mostrarNinjaPorId(Long id){
        return repository.findById(id);
    }

    public NinjaDTO adicionarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = mapper.map(ninjaDTO);
        ninja = repository.save(ninja);
        return mapper.map(ninja);
    }

    public void deletarNinja(Long id){
           repository.deleteById(id);
    }

    public NinjaModel alterarNinja(Long id, NinjaModel ninja){
        if(repository.existsById(id)){
            ninja.setId(id);
            return repository.save(ninja);
        }
        return null;
    }
}
