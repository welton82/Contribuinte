package entities;

public class Juridica extends Contribuinte{
    private Integer qdeFuncionarios;
    private String cnpj;

    public Juridica() {
        super();
    }

    public Juridica(String rua, String quadra, String lote, String cep, String cidade, String nome, Endereco endereco,
                    Integer idContribuinte, Double rendaAnual, Double impostoPg, Integer qdeFuncionarios, String cnpj) {
        super(rua, quadra, lote, cep, cidade, nome, endereco, idContribuinte, rendaAnual, impostoPg);
        this.qdeFuncionarios = qdeFuncionarios;
        this.cnpj = cnpj;
    }

    public Integer getQdeFuncionarios() {
        return qdeFuncionarios;
    }

    public void setQdeFuncionarios(Integer qdeFuncionarios) {
        this.qdeFuncionarios = qdeFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
        super.setDado(cnpj);
    }



    @Override
    public Double obterRendaAnual() {
        if(getQdeFuncionarios() > 10){
            return super.getRendaAnual()* 0.14;
        }else{
            return super.getRendaAnual()* 0.16;
        }
    }

}
