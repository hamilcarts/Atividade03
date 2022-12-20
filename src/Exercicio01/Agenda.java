package Exercicio01;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    Map<String, String> agenda;

    public Agenda() {
        this.agenda = new HashMap<>();
    }

    public void setAgenda(Map<String, String> agenda) {
        this.agenda = agenda;
    }

    public Map<String, String> getAgenda() {
        return agenda;
    }

    public void adicionarCompromisso(String titulo, String descricao) {
        this.agenda.put(titulo, descricao);
    }

    @Override
    public String toString() {
        return "" +
                "" + agenda +
                "";
    }
}
