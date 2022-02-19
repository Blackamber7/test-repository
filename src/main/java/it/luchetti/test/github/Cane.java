/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.luchetti.test.github;

/**
 *
 * @author Matteo
 */
public class Cane extends Animale{
    private String nome;
    private int eta;
    private String razza;

    public Cane() {
    }

    public Cane(String nome, int eta, String razza) {
        this.nome = nome;
        this.eta = eta;
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }
    
    
}
 