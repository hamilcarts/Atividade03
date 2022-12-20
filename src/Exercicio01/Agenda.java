package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Agenda {


    //Map<String, String> agenda;
    List<Compromisso> listaDeCompromissos = new ArrayList<>();

    public void cadastrarCompromisso(Compromisso compromisso){
        listaDeCompromissos.add(compromisso);
    }

    public void removerCompromisso(String titulo){
        if(listaDeCompromissos.size() == 0) return;
        for(Compromisso compromisso : listaDeCompromissos){
            if(compromisso.getTitulo().equals(titulo)){
                listaDeCompromissos.remove(compromisso);
            }
        }
    }


    public List<Compromisso> getListaDeCompromissos() {
        return listaDeCompromissos;
    }

    public void setListaDeCompromissos(List<Compromisso> listaDeCompromissos) {
        this.listaDeCompromissos = listaDeCompromissos;
    }

    @Override
    public String toString() {
        return "Agenda: " + listaDeCompromissos;
    }
}
