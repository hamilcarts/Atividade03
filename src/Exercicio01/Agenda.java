package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Agenda {


    //Map<String, String> agenda;
    List<Compromisso> agenda = new ArrayList<>();

    public void cadastrarCompromisso(Compromisso compromisso){
        agenda.add(compromisso);
    }

    public void removerCompromisso(String titulo){
        if(agenda.size() == 0) return;
        for(Compromisso compromisso : agenda){
            if(compromisso.getTitulo().equals(titulo)){
                agenda.remove(compromisso);
            }
        }
    }


    public List<Compromisso> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Compromisso> agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Agenda: " + agenda;
    }
}
