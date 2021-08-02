package Modelo;

import Modelo.Disciplina;
import Modelo.Presencial;
import Modelo.Sala;
//Class Semestral e seus Atributos
public class Semestral extends Presencial {
    //Método Construtor de Semestral e o Super chamando construtor da superclasse
    public Semestral(int ano, int semestre, int turma, Disciplina disciplina, String diaSemana,
                     int hora, int duracao, Sala sala)
    {
        super(ano, semestre, turma, disciplina, diaSemana, hora, duracao, sala);

    }


}
