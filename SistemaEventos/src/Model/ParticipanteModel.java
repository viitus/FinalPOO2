package Model;

import java.time.LocalDateTime;

public class ParticipanteModel {

    private String cpf;
    private int idade;
    private String nome;
    private String celular;
    private LocalDateTime criadoEm;

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ParticipanteModel() {
    }

    public ParticipanteModel(String cpf, int idade, String nome, String celular, LocalDateTime criadoEm) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.celular = celular;
        this.criadoEm = criadoEm;
    }
}
