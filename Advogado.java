/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String oab) {
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    @Override
    public String toString() {
        return "Advogado{" + "\noab = " +super.toString() + oab + '}';
    }
    
}
