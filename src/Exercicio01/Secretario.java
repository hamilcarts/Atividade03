package Exercicio01;

public class Secretario extends Funcionario{

    public String listarAgenda(){
        return this.listarAgenda();
    }

    public Secretario(String nome, String cpf, double salario, Agenda agenda) {
        super(nome, cpf, salario, agenda);
    }

    @Override
    public String toString() {
        return "Secretario{}";
    }
}
