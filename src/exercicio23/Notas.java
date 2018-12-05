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
public class Notas {
    private float nota1, nota2, nota3, media;

    public Notas() {
    }

    public Notas(float n1, float n2, float n3) {
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    
    public void calc_media(){
        media = ((nota1 + nota2 + nota3)/3);
    }
}
