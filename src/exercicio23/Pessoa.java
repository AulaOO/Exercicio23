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
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String CPF;
    private int identidade;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String n, String t, String e, String c, int id, int i) {
        nome = n;
        telefone = t;
        endereco = e;
        CPF = c;
        identidade = id;
        idade = i;
    }

    public Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdentidade() {
        return identidade;
    }

    public int getIdade() {
        return idade;
    }
    
    public int getIdade(int ano_atual, int ano_futuro){
        return ano_atual;
    }
}
