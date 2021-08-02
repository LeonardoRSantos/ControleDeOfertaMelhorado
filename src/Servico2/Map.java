package Servico2;

import Modelo.Disciplina;
import Modelo.Oferta;
import Modelo.Presencial;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
//Class Mapa Responsável para cadastrar os dados.
public class Map {
    private java.util.Map<Integer, Disciplina> disciplinas;
    private java.util.Map<Integer, Oferta> ofertas;
    private java.util.Map<Integer, Presencial> presenciais;

    public Map() {
        disciplinas = new Hashtable<Integer, Disciplina>();
        ofertas = new Hashtable<Integer, Oferta>();
        presenciais = new Hashtable<Integer, Presencial>();
    }

    public Boolean cadastrarDisciplina(Disciplina disciplina){
        return disciplinas.put(disciplinas.keySet().size(), disciplina) != null;
    }

    public List <Disciplina> listarDisciplina(){
        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        for(Integer key : this.disciplinas.keySet()){
            disciplinas.add(this.disciplinas.get(key));
        }
        return disciplinas;
    }

    public Boolean disciplinaOfertada(Oferta oferta){
        return ofertas.put(ofertas.keySet().size(), oferta) != null;
    }
    public List <Oferta> listarOferta(){
        List<Oferta> ofertas = new ArrayList<Oferta>();
        for(Integer key : this.ofertas.keySet()){
            ofertas.add(this.ofertas.get(key));
        }
        return ofertas;
    }
    public Boolean efetuaPresencial(Presencial presencial){
        return presenciais.put(presenciais.keySet().size(), presencial) != null;
    }
    public List <Presencial> listarPresencial(){
        List<Presencial> presenciais = new ArrayList<Presencial>();
        for(Integer key : this.presenciais.keySet()){
            presenciais.add(this.presenciais.get(key));
        }
        return presenciais;
    }

    public List<Disciplina> consultaDisciplina(int codigo, String nome){
        return null;
    }

    public List<Disciplina> consultaDisciplina(Oferta oferta)
    {
        return null;

    }
    public Boolean checkin(Oferta oferta){
        return null;

    }
    public Boolean checkout(Oferta oferta)
    {
        return  null;
    }

    public List<Disciplina> verDisponibilidadeDisciplina(int codigo, String nome)
    {
        return null;
    }



}
