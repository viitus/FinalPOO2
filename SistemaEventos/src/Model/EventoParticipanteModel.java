package Model;

public class EventoParticipanteModel {
    private int idEvento;
    private String cpfParticipante;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getCpfParticipante() {
        return cpfParticipante;
    }

    public void setCpfParticipante(String cpfParticipante) {
        this.cpfParticipante = cpfParticipante;
    }

    public EventoParticipanteModel() {
    }

    public EventoParticipanteModel(int idEvento, String cpfParticipante) {
        this.idEvento = idEvento;
        this.cpfParticipante = cpfParticipante;
    }
}
