package Modelo;
//Class Oferta e Seus Atributos
public class Oferta {
    private int ano;
    private int semestre;
    private int turma;
    private Disciplina disciplina;
    private int idoferta;
    ////Método Construtor de oferta
    public Oferta(int ano, int semestre, int turma, Disciplina disciplina) {
        this.ano = ano;
        this.semestre = semestre;
        this.turma = turma;
        this.disciplina = disciplina;
    }
    //Gett and Setter
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(int idoferta) {
        this.idoferta = idoferta;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    //Método To String retorna a string dos objetos
    @Override
    public String toString() {
        return "Oferta{" +
                "ano=" + ano +
                ", semestre=" + semestre +
                ", turma=" + turma +
                ", disciplina=" + disciplina +
                ", idoferta=" + idoferta +
                '}';
    }
}
