package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AtividadeModel {

    private int idAtividade;
    private String tipoAtividade;
    private String tituloAtividade;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFim;
    private LocalDateTime criadoEm;


    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getTituloAtividade() {
        return tituloAtividade;
    }

    public void setTituloAtividade(String tituloAtividade) {
        this.tituloAtividade = tituloAtividade;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalDateTime horaFim) {
        this.horaFim = horaFim;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public AtividadeModel() {
    }

    public AtividadeModel(int idAtividade, String tipoAtividade, String tituloAtividade, LocalDateTime horaInicio, LocalDateTime horaFim, LocalDateTime criadoEm) {
        this.idAtividade = idAtividade;
        this.tipoAtividade = tipoAtividade;
        this.tituloAtividade = tituloAtividade;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.criadoEm = criadoEm;
    }
}