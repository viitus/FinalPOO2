package Model;

public class LocalModel {
    private int idLocal;
    private int capacidade;
    private String ruaEndereco;
    private String numEndereco;
    private String cepEndereco;
    private String cidadeEndereco;
    private String nomeLocal;

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getRuaEndereco() {
        return ruaEndereco;
    }

    public void setRuaEndereco(String ruaEndereco) {
        this.ruaEndereco = ruaEndereco;
    }

    public String getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(String numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public LocalModel() {
    }

    public LocalModel(int idLocal, int capacidade, String ruaEndereco, String numEndereco, String cepEndereco, String cidadeEndereco, String nomeLocal) {
        this.idLocal = idLocal;
        this.capacidade = capacidade;
        this.ruaEndereco = ruaEndereco;
        this.numEndereco = numEndereco;
        this.cepEndereco = cepEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.nomeLocal = nomeLocal;
    }
    
    @Override
    public String toString(){
        return this.nomeLocal;
    }
}