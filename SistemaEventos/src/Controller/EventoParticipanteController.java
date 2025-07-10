package Controller;

import Model.EventoParticipanteModel;
import Util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventoParticipanteController {
    // select evento_participante (read)
    public EventoParticipanteModel select(EventoParticipanteModel ep){
        EventoParticipanteModel retorno = null;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from evento_participante where id_evento = ? and cpf_participante = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, ep.getIdEvento());
            sentenca.setString(2, ep.getCpfParticipante());

            ResultSet resultquery = sentenca.executeQuery();
            if (resultquery.next()){
                retorno = new EventoParticipanteModel();
                retorno.setIdEvento(resultquery.getInt("id_evento"));
                retorno.setCpfParticipante(resultquery.getString("cpf_participante"));
            }
        } catch (SQLException e) {
            System.out.println("Erro Select EventoParticipante: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // select todos evento_participante
    public ArrayList<EventoParticipanteModel> selectAll(){
        ArrayList<EventoParticipanteModel> retorno = new ArrayList<>();
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from evento_participante";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            ResultSet resultquery = sentenca.executeQuery();
            while (resultquery.next()){
                EventoParticipanteModel ep = new EventoParticipanteModel();
                ep.setIdEvento(resultquery.getInt("id_evento"));
                ep.setCpfParticipante(resultquery.getString("cpf_participante"));
                retorno.add(ep);
            }
        } catch (SQLException e) {
            System.out.println("Erro Select All EventoParticipante: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // create
    public boolean insert(EventoParticipanteModel ep){
        boolean result = false;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "insert into evento_participante (id_evento, cpf_participante) values (?,?)";
        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, ep.getIdEvento());
            sentenca.setString(2, ep.getCpfParticipante());

            if (!sentenca.execute()){
                result = true;
            }

        } catch (SQLException e){
            System.out.println("Erro Insert EventoParticipante: " + e.getMessage());
        }

        conexao.desconectar();
        return result;
    }

    // delete
    public boolean delete(EventoParticipanteModel ep){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();

        String sql = "DELETE FROM evento_participante WHERE id_evento = ? AND cpf_participante = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, ep.getIdEvento());
            sentenca.setString(2, ep.getCpfParticipante());
            
            int linhasAfetadas = sentenca.executeUpdate();
            if (linhasAfetadas > 0) {
               result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL DELETE EVENTO_PARTICIPANTE: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }
}
