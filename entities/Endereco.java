package entities;

public class Endereco {
    private String rua;
    private String quadra;
    private String lote;
    private String cep;
    private String cidade;

    public Endereco() {
    }

    public Endereco(String rua, String quadra, String lote, String cep, String cidade) {
        this.rua = rua;
        this.quadra = quadra;
        this.lote = lote;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
       StringBuilder s = new StringBuilder();
       s.append("==== Dados de Endereço ======\n");
       s.append(rua + "\n");
       s.append(quadra + "\n");
       s.append(lote + "\n");
       s.append(cep + "\n");
       s.append(cidade + "\n");
       s.append("================\n");
       return s.toString();
    }
}
