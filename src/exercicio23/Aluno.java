/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23;

/**
 *
 * @author Luis Guilherme
 */
public class Aluno extends Pessoa{
    private int matricula;
    private Notas notaAluno = new Notas();

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(String n, String t, String e, String c, int id, int i, int m) {
    }

    public Aluno(int matricula, String n, int i) {
        super(n, i);
        this.matricula = matricula;
    }
    
    
}
