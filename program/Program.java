package program;

import entities.Contribuinte;
import entities.Endereco;
import entities.Fisica;
import entities.Juridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        meuMenu(scan);





    }

    public static void meuMenu(Scanner scan){

        List<Contribuinte>contribuintes = new ArrayList<Contribuinte>();
        int op = 1;
        while(op!=0){
            System.out.println("==== Menu ======");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir Pessoa Fisica");
            System.out.println("2 - Inserir Pessoa Jurídica");
            System.out.println("3 - Listar");
            System.out.print("Operação: " );
            op = scan.nextInt();
            scan.nextLine();
            switch(op){
                case 0:
                    System.out.println("Obrigado!\nMenu Finalizado!");
                    break;
                case 1:
                    System.out.println("====== Menu Pessoa Fisica =======");
                    System.out.print("Informe o nome do contribuinte: ");
                    String nome = scan.nextLine();
                    System.out.print("Informe o Cpf: ");
                    String cpf = scan.nextLine();
                    System.out.print("Informe  o Rua da Residencia: ");
                    String rua = scan.nextLine();
                    System.out.print("Informe Quadra: ");
                    String qd = scan.nextLine();
                    System.out.print("Informe o Lote: ");
                    String lt = scan.nextLine();

                    System.out.print("Informe o Cep: ");
                    String cep = scan.next();
                    System.out.print("Informe a Cidade Que Reside: ");
                    String cidade = scan.nextLine();
                    Endereco endereco = new Endereco(rua,qd,lt,cep,cidade);
                    scan.nextLine();
                    System.out.print("Numero do Contribunte: ");
                    int id = scan.nextInt();
                    System.out.print("Renda Anual: ");
                    double renda = scan.nextDouble();
                    System.out.print("Informe porcentagem do imposto pago");
                    System.out.print("Acima de 20000.00 20 (0.20)% ou Abaixo de 20000.00 15%(0.15): ");
                    double pc = scan.nextDouble();
                    System.out.print("Valor Gasto com Saude: ");
                    double gastoS = scan.nextDouble();


                    contribuintes.add(new Fisica(rua,qd,lt,cep,cidade,nome,endereco,id,renda,pc,cpf,gastoS));


                    break;
                case 2:
                    System.out.println("====== Menu Pessoa Juridica =======");
                    System.out.print("Informe o nome da Empresa: ");
                    nome = scan.nextLine();
                    System.out.print("Informe o Cnpj: ");
                    String cnpj = scan.nextLine();
                    System.out.print("Informe  o Rua da Empresa: ");
                    rua = scan.nextLine();
                    System.out.print("Informe Quadra: ");
                    qd = scan.nextLine();
                    System.out.print("Informe o Lote: ");
                    lt = scan.nextLine();
                    System.out.print("Informe o Cep: ");
                    cep = scan.next();
                    System.out.print("Informe a Cidade da Empresa: ");
                    cidade = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Numero do Contribunte: ");
                    id = scan.nextInt();
                    System.out.print("Renda Anual: ");
                    renda = scan.nextDouble();
                    System.out.print("Informe porcentagem do imposto pago");
                    System.out.print("Acima de 10 Funcionarios  20%(0.14) ou Abaixo de 10 Funcionários 16%(0.16): ");
                    pc = scan.nextDouble();
                    System.out.print("Quantidade de Funcionarios: ");
                    int qde = scan.nextInt();
                    endereco = new Endereco(rua,qd,lt,cep,cidade);
                    contribuintes.add(new Juridica(rua, qd, lt, cep, cidade, nome, endereco, id, renda, pc,qde, cnpj));
                    break;
                case 3:
                    for(Contribuinte x: contribuintes){
                        System.out.println("Nome " + x.getNome());
                        System.out.println("Id Contribuinte: " + x.getIdContribuinte());
                        System.out.println("CNPJ ou CPF: " + x.getDado());
                        System.out.println("Rua: " + x.getRua());
                        System.out.println("Quadra: " + x.getQuadra());
                        System.out.println("Lote: " + x.getLote());
                        System.out.println("CEP: " + x.getCep());
                        System.out.println("Cidade: " + x.getCidade());
                        System.out.println("Renda Anual: "+ x.getRendaAnual());
                        System.out.println("Imposto: " + x.getImpostoPg());
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;



            }

        }



    }
}
