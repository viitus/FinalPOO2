package Controller;

import Model.LocalModel;
import Util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LocalController {
    // select local (read)
    public LocalModel select(LocalModel local){
        LocalModel retorno = null;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from local_evento where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, local.getIdLocal());

            ResultSet resultquery = sentenca.executeQuery();
            if (resultquery.next()){
                retorno = new LocalModel();
                retorno.setIdLocal(resultquery.getInt("id"));
                retorno.setCapacidade(resultquery.getInt("capacidade"));
                retorno.setRuaEndereco(resultquery.getString("rua"));
                retorno.setNumEndereco(resultquery.getString("numero"));
                retorno.setCepEndereco(resultquery.getString("cep"));
                retorno.setCidadeEndereco(resultquery.getString("cidade"));
                retorno.setNomeLocal(resultquery.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro Select Local: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // select todos locais
    public ArrayList<LocalModel> selectAll(){
        ArrayList<LocalModel> retorno = new ArrayList<>();
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "select * from local_evento";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            ResultSet resultquery = sentenca.executeQuery();
            while (resultquery.next()){
                LocalModel local = new LocalModel();
                local.setIdLocal(resultquery.getInt("id"));
                local.setCapacidade(resultquery.getInt("capacidade"));
                local.setRuaEndereco(resultquery.getString("rua"));
                local.setNumEndereco(resultquery.getString("numero"));
                local.setCepEndereco(resultquery.getString("cep"));
                local.setCidadeEndereco(resultquery.getString("cidade"));
                local.setNomeLocal(resultquery.getString("nome"));
                retorno.add(local);
            }
        } catch (SQLException e) {
            System.out.println("Erro Select All Local: " + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    // create
    public boolean insert(LocalModel local){
        boolean result = false;
        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "insert into local_evento (capacidade, rua, numero, cep, cidade, nome) values (?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, local.getCapacidade());
            sentenca.setString(2, local.getRuaEndereco());
            sentenca.setString(3, local.getNumEndereco());
            sentenca.setString(4, local.getCepEndereco());
            sentenca.setString(5, local.getCidadeEndereco());
            sentenca.setString(6, local.getNomeLocal());

            if (!sentenca.execute()){
                result = true;
            }

        } catch (SQLException e){
            System.out.println("Erro Insert Local: " + e.getMessage());
        }

        conexao.desconectar();
        return result;
    }

    // update
    public boolean update(LocalModel local){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();
        String sql = "update local_evento set capacidade = ?, rua = ?, numero = ?, cep = ?, cidade = ?, nome = ? where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, local.getCapacidade());
            sentenca.setString(2, local.getRuaEndereco());
            sentenca.setString(3, local.getNumEndereco());
            sentenca.setString(4, local.getCepEndereco());
            sentenca.setString(5, local.getCidadeEndereco());
            sentenca.setString(6, local.getNomeLocal());
            sentenca.setInt(7, local.getIdLocal());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL UPDATE LOCAL: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }

    // delete
    public boolean delete(LocalModel local){
        boolean result = false;

        Conexao conexao = new Conexao();
        conexao.conectar();

        String sql = "delete from local_evento where id = ?";

        try {
            PreparedStatement sentenca = conexao.conector.prepareStatement(sql);
            sentenca.setInt(1, local.getIdLocal());

            if (!sentenca.execute()){
                result = true;
            }
        } catch (SQLException e){
            System.out.println("ERRO SQL DELETE LOCAL: " + e.getMessage());
        }
        conexao.desconectar();
        return result;
    }
    
    
    public LocalModel selectById(int id){
        for (LocalModel l: selectAll()){
            if(l.getIdLocal() == id){
                return l;
            }
        }
        return null;
    }
    
}
