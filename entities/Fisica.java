package entities;

public class Fisica extends Contribuinte{
    private String cpf;
    private Double gastosSaude;

    public Fisica() {
        super();
    }

    public Fisica(String rua, String quadra, String lote, String cep, String cidade, String nome, Endereco endereco,
                  Integer idContribuinte, Double rendaAnual, Double impostoPg, String cpf, Double gastosSaude) {
        super(rua, quadra, lote, cep, cidade, nome, endereco, idContribuinte, rendaAnual, impostoPg);
        this.cpf = cpf;
        this.gastosSaude = gastosSaude;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        super.setDado(cpf);

    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }



    @Override
    public Double obterRendaAnual() {
        if(super.getRendaAnual() < 20000.00){
            return (super.getRendaAnual() *  0.15) - (getGastosSaude() * 0.50) ;
        }
        else{
            return (super.getRendaAnual() *  0.25) - (getGastosSaude() * 0.50) ;

        }

    }
}
