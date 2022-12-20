package Exercicio01;

public class Secretario extends Funcionario{

    public Secretario(String nome, String cpf, double salario, Agenda agenda) {
        super(nome, cpf, salario, agenda);
    }

    public void listarAgenda(Funcionario funcionario){
        System.out.println("Agenda do funcionário: " + funcionario.getNome());
        Agenda agenda = funcionario.getAgenda();
        if(agenda.getListaDeCompromissos().size() == 0){
            System.out.println("Sem compromissos cadastrado.");
            return;
        }
        for(Compromisso compromisso : agenda.getListaDeCompromissos()){
            System.out.println(compromisso);
        }
    }
}
