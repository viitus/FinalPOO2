package Controller;

import Model.ParticipanteModel;
import Util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import java.util.ArrayList;
public class ParticipanteController {
    // select participante (read)
    public ParticipanteModel select(ParticipanteModel participante){
        ParticipanteModel retorno = null;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from participante where cpf = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, participante.getCpf());

            ResultSet resultquery = sentenca.executeQuery();
            if (resultquery.next()){
                retorno = new ParticipanteModel();
                retorno.setCpf(resultquery.getString("cpf"));
                retorno.setIdade(resultquery.getInt("idade"));
                retorno.setNome(resultquery.getString("nome"));
                retorno.setCelular(resultquery.getString("celular"));
                retorno.setCriadoEm(resultquery.getTimestamp("criado_em").toLocalDateTime());
            }
        } catch (SQLException e) {
            System.out.println("Erro Select Participante: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // select todos participantes
    public ArrayList<ParticipanteModel> selectAll(){
        ArrayList<ParticipanteModel> retorno = new ArrayList<>();
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from participante";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            ResultSet resultquery = sentenca.executeQuery();
            while (resultquery.next()){
                ParticipanteModel participante = new ParticipanteModel();
                participante.setCpf(resultquery.getString("cpf"));
                participante.setIdade(resultquery.getInt("idade"));
                participante.setNome(resultquery.getString("nome"));
                participante.setCelular(resultquery.getString("celular"));
                participante.setCriadoEm(resultquery.getTimestamp("criado_em").toLocalDateTime());
                retorno.add(participante);
            }
        } catch (SQLException e) {
            System.out.println("Erro Select All Participante: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }
    // create
    public boolean insert(ParticipanteModel participante){
        boolean result = false;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "insert into participante (cpf, idade, nome, celular, criado_em) values (?,?,?,?,?)";
        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, participante.getCpf());
            sentenca.setInt(2, participante.getIdade());
            sentenca.setString(3, participante.getNome());
            sentenca.setString(4, participante.getCelular());
            sentenca.setObject(5, participante.getCriadoEm());

            if (!sentenca.execute()){
                result = true;
            }

        } catch (SQLException e){
            System.out.println("Erro Insert Participante: " + e.getMessage());
        }

        conexao.desconectar();
        return result;
    }

    // update
    public boolean update(ParticipanteModel participante){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "update participante set idade = ?, nome = ?, celular = ?, criado_em = ? where cpf = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, participante.getIdade());
            sentenca.setString(2, participante.getNome());
            sentenca.setString(3, participante.getCelular());
            sentenca.setObject(4, participante.getCriadoEm());
            sentenca.setString(5, participante.getCpf());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL UPDATE PARTICIPANTE: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }

    // delete
    public boolean delete(ParticipanteModel participante){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();

        String sql = "delete from participante where cpf = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setString(1, participante.getCpf());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL DELETE: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }
}
