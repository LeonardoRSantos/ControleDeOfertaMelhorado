package Modelo;
//Class Distancia e seus Atributos
public class Distancia extends Oferta {
    private String url;
    //Método Construtor de Distancia
    public Distancia(int ano, int semestre, int turma, Disciplina disciplina, String url) {
        super(ano, semestre, turma, disciplina);
        this.url = url;
    }
    //Gett and Setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    //Método To String retorna a string dos objetos
    @Override
    public String toString() {
        return "Distancia{" +
                "url='" + url + '\'' +
                '}';
    }
}
