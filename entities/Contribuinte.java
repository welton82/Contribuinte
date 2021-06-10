package entities;

public abstract class Contribuinte extends Endereco{
    private String nome;
    private Endereco endereco;
    private Integer idContribuinte;
    private Double rendaAnual;
    private Double impostoPg;
    private String dado;
    public Contribuinte() {
        super();
    }

    public Contribuinte(String rua, String quadra, String lote, String cep, String cidade, String nome,
                        Endereco endereco, Integer idContribuinte, Double rendaAnual, Double impostoPg) {
        super(rua, quadra, lote, cep, cidade);
        this.nome = nome;
        this.endereco = endereco;
        this.idContribuinte = idContribuinte;
        this.rendaAnual = rendaAnual;
        this.impostoPg = impostoPg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getIdContribuinte() {
        return idContribuinte;
    }

    public void setIdContribuinte(Integer idContribuinte) {
        this.idContribuinte = idContribuinte;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double getImpostoPg() {
        return impostoPg;
    }

    public void setImpostoPg(Double impostoPg) {
        this.impostoPg = impostoPg;
    }

    public void setDado(String d){
        dado = d;
    }
    public String getDado(){
        return dado;
    }
    public abstract Double obterRendaAnual();
}
