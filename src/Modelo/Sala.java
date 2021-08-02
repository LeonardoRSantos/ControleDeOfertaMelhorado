package Modelo;

import java.util.ArrayList;
//Class Sala e seus Atributos
public class Sala {
    private String numero;
    private int capacidade;
    private ArrayList <Presencial> presencial;
    //Método Construtor de disciplina
    public Sala(String numero, int capacidade, ArrayList<Presencial> presencial) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.presencial = presencial;
    }
    //Gett and Setter
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Presencial> getPresencial() {
        return presencial;
    }

    public void setPresencial(ArrayList<Presencial> presencial) {
        this.presencial = presencial;
    }
}
