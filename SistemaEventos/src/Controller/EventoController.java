package Controller;

import Model.EventoModel;
import Util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventoController {
    // select evento (read)
    public EventoModel select(EventoModel evento){
        EventoModel retorno = null;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from evento where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, evento.getIdEvento());

            ResultSet resultquery = sentenca.executeQuery();
            if (resultquery.next()){
                retorno = new EventoModel();
                retorno.setIdEvento(resultquery.getInt("id"));
                retorno.setNomeEvento(resultquery.getString("nome"));
                retorno.setDescricaoEvento(resultquery.getString("descricao"));
                retorno.setDataInicio(resultquery.getTimestamp("data_inicio").toLocalDateTime());
                retorno.setDataFim(resultquery.getTimestamp("data_fim").toLocalDateTime());
                retorno.setIdAtividade(resultquery.getInt("id_atividade"));
                retorno.setIdLocal(resultquery.getInt("id_local"));
            }
        } catch (SQLException e) {
            System.out.println("Erro Select Evento: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // select todos eventos
    public ArrayList<EventoModel> selectAll(){
        ArrayList<EventoModel> retorno = new ArrayList<>();
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from evento";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            ResultSet resultquery = sentenca.executeQuery();
            while (resultquery.next()){
                EventoModel evento = new EventoModel();
                evento.setIdEvento(resultquery.getInt("id"));
                evento.setNomeEvento(resultquery.getString("nome"));
                evento.setDescricaoEvento(resultquery.getString("descricao"));
                evento.setDataInicio(resultquery.getTimestamp("data_inicio").toLocalDateTime());
                evento.setDataFim(resultquery.getTimestamp("data_fim").toLocalDateTime());
                evento.setIdAtividade(resultquery.getInt("id_atividade"));
                evento.setIdLocal(resultquery.getInt("id_local"));
                retorno.add(evento);
            }
        } catch (SQLException e) {
            System.out.println("Erro Select All Evento: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // create
    public boolean insert(EventoModel evento){
        boolean result = false;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "insert into evento (nome, descricao, data_inicio, data_fim, id_atividade, id_local) values (?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, evento.getNomeEvento());
            sentenca.setString(2, evento.getDescricaoEvento());
            sentenca.setObject(3, evento.getDataInicio());
            sentenca.setObject(4, evento.getDataFim());
            sentenca.setInt(5, evento.getIdAtividade());
            sentenca.setInt(6, evento.getIdLocal());

            if (!sentenca.execute()){
                result = true;
            }

        } catch (SQLException e){
            System.out.println("Erro Insert Evento: " + e.getMessage());
        }

        conexao.desconectar();
        return result;
    }

    // update
    public boolean update(EventoModel evento){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "update evento set nome = ?, descricao = ?, data_inicio = ?, data_fim = ?, id_atividade = ?, id_local = ? where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, evento.getNomeEvento());
            sentenca.setString(2, evento.getDescricaoEvento());
            sentenca.setObject(3, evento.getDataInicio());
            sentenca.setObject(4, evento.getDataFim());
            sentenca.setInt(5, evento.getIdAtividade());
            sentenca.setInt(6, evento.getIdLocal());
            sentenca.setInt(7, evento.getIdEvento());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL UPDATE EVENTO: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }

    // delete
    public boolean delete(EventoModel evento){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();

        String sql = "delete from evento where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, evento.getIdEvento());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL DELETE EVENTO: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }
}
