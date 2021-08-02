package Modelo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//Class Disciplina e seus Atributos
public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Oferta> oferta;
    //Método Construtor de disciplina
    public Disciplina(int codigo, String nome, ArrayList<Oferta> oferta) {
        this.codigo = codigo;
        this.nome = nome;
        this.oferta = oferta;
    }
    //Gett and Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public ArrayList<Oferta> getOferta() {
        return oferta;
    }*/

    /*public void setOferta(ArrayList<Oferta> oferta) {
        this.oferta = oferta;
    }*/
    //Método To String retorna a string dos objetos
    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", oferta=" +
                '}';
    }


    /*public Oferta setOferta() {
        return null;
    }*/
}
