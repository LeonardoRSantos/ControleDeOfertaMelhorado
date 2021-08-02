package Principal;
//Importação de Biblioteca do Swing
import javax.swing.JFrame;
// importação das classes
import Modelo.Disciplina;
import Modelo.Oferta;
import Servico2.Map;

//Importação da função arraylist
import java.util.ArrayList;


//Class Main
public class Main extends JFrame{
 //Amo programar
 public static void main(String[] args) {
  //Chamando As class e criando uma nova instancia
  Map app = new Map();
  ArrayList<Oferta> ofertas = new ArrayList<>();

  //Instância os objetos e passa os parâmetros
  Disciplina disciplina1 = new Disciplina(1,"Programação",ofertas);
  Disciplina disciplina2 = new Disciplina(2,"Algoritmos",ofertas);
  //instancia o objeto e passa os parametros de disciplina1 para cadastrardisciplina
  app.cadastrarDisciplina(disciplina1);
  app.cadastrarDisciplina(disciplina2);
  //Imprimir os parametros no console
  System.out.println("Codigo: " +disciplina1.getCodigo() + "\n" + " Nome: "+ disciplina1.getNome());
  System.out.println("");

  //Instância os objetos e passa os parâmetros
  Oferta oferta1 = new Oferta(2021,1,1, disciplina1);
  Oferta oferta2 = new Oferta(2021,2,2, disciplina2);

  //instancia o objeto e passa os parametros de oferta para disciplinaOfertada
  app.disciplinaOfertada(oferta1);
  app.disciplinaOfertada(oferta2);

  //Imprimir os parametros no console
  System.out.println("Codigo: " +disciplina2.getCodigo() + "\n" + " Nome: "+ disciplina2.getNome());
  System.out.println("");
  System.out.println("Ano: " +oferta1.getAno() + "\n" + " Semestre: "+ oferta1.getSemestre()+
                    "\n" + " Turma: "+ oferta1.getTurma()+ "\n"); //+ //" Disciplina: "+ oferta1.getDisciplina());
  System.out.println("Ano: " +oferta2.getAno() + "\n" + " Semestre: "+ oferta2.getSemestre()+
                     "\n" + " Turma: "+ oferta2.getTurma()+ "\n");// + " Disciplina: "+ oferta2.getDisciplina());

 }
}