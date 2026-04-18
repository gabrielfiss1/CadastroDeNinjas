package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity // entidade no banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    Long uuid;
    String nome;
    String email;
    String idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, String idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
