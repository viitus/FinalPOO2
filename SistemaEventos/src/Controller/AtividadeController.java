package Controller;

import Model.AtividadeModel;
import Util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Timestamp;

public class AtividadeController {

    // select atividade (read)

    public AtividadeModel select(AtividadeModel atividade){
        AtividadeModel retorno = null;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from atividade where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, atividade.getIdAtividade());

            ResultSet resultquery = sentenca.executeQuery();
            if (resultquery.next()){
                retorno = new AtividadeModel();
                retorno.setIdAtividade(resultquery.getInt("id"));
                retorno.setTipoAtividade(resultquery.getString("tipo"));
                retorno.setTituloAtividade(resultquery.getString("titulo"));
                retorno.setHoraInicio(resultquery.getTimestamp("hora_inicio").toLocalDateTime());
                retorno.setHoraFim(resultquery.getTimestamp("hora_fim").toLocalDateTime());
                retorno.setCriadoEm(resultquery.getTimestamp("criado_em").toLocalDateTime());
                retorno.setIdEvento(resultquery.getInt("id_evento"));
            }
        } catch (SQLException e) {
            System.out.println("Erro Select Atividade: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // select todas atividades
    public ArrayList<AtividadeModel> selectAll(){
        ArrayList<AtividadeModel> retorno = new ArrayList<>();
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from atividade";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            ResultSet resultquery = sentenca.executeQuery();
            while (resultquery.next()){
                AtividadeModel atividade = new AtividadeModel();
                atividade.setIdAtividade(resultquery.getInt("id"));
                atividade.setTipoAtividade(resultquery.getString("tipo"));
                atividade.setTituloAtividade(resultquery.getString("titulo"));
                // Tratamento seguro para campos de data/hora
                Timestamp timestamp;

                timestamp = resultquery.getTimestamp("hora_inicio");
                atividade.setHoraInicio(timestamp != null ? timestamp.toLocalDateTime() : null);
                timestamp = resultquery.getTimestamp("hora_fim");
                atividade.setHoraFim(timestamp != null ? timestamp.toLocalDateTime() : null);
                timestamp = resultquery.getTimestamp("criado_em");
                atividade.setCriadoEm(timestamp != null ? timestamp.toLocalDateTime() : null);
                atividade.setIdEvento(resultquery.getInt("id_evento"));
                retorno.add(atividade);
            }
        } catch (SQLException e) {
            System.out.println("Erro Select All Atividade: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // create
    public boolean insert(AtividadeModel atividade){
        boolean result = false;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "insert into atividade (tipo, titulo, hora_inicio, hora_fim, criado_em, id_evento) values (?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, atividade.getTipoAtividade());
            sentenca.setString(2, atividade.getTituloAtividade());
            sentenca.setObject(3, atividade.getHoraInicio());
            sentenca.setObject(4, atividade.getHoraFim());
            sentenca.setObject(5, atividade.getCriadoEm());
            sentenca.setInt(6,atividade.getIdEvento());
            if (!sentenca.execute()){
                result = true;
            }

        } catch (SQLException e){
            System.out.println("Erro Insert Atividade: " + e.getMessage());
        }

        conexao.desconectar();
        return result;
    }

    // update
    public boolean update(AtividadeModel atividade){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "UPDATE atividade SET tipo = ?, titulo = ?, hora_inicio = ?, hora_fim = ?, criado_em = ?, id_evento = ? WHERE id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, atividade.getTipoAtividade());
            sentenca.setString(2, atividade.getTituloAtividade());
            sentenca.setObject(3, atividade.getHoraInicio());
            sentenca.setObject(4, atividade.getHoraFim());
            sentenca.setObject(5, atividade.getCriadoEm());
            sentenca.setInt(6, atividade.getIdEvento());
            sentenca.setInt(7, atividade.getIdAtividade());
         
            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL UPDATE ATIVIDADE: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }

    // delete
    public boolean delete(AtividadeModel atividade){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();

        String sql = "delete from atividade where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, atividade.getIdAtividade());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL DELETE ATIVIDADE: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }
}
