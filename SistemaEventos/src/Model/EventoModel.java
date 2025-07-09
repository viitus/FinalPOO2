package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventoModel {
    private int idEvento;
    private String nomeEvento;
    private String descricaoEvento;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    private int idAtividade;
    private int idLocal;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }


    
    public EventoModel() {
    }

    public EventoModel(int idEvento, String nomeEvento, String descricaoEvento, LocalDateTime dataInicio, LocalDateTime dataFim, int idAtividade, int idLocal) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.descricaoEvento = descricaoEvento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idAtividade = idAtividade;
        this.idLocal = idLocal;
    }
    
    @Override
    public String toString(){
        return this.nomeEvento;
    }
}