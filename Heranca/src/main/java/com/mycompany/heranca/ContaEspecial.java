/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author rikam
 */
public class ContaEspecial extends ContaCorrente{
    public double limite;
    public double saldoDevedor;
    public ContaEspecial(int agencia, int numeroConta, String cliente, String cpf, double limite){
        super(agencia, numeroConta, cliente, cpf);   
    this.limite = limite;
    }
    
    @Override
    public double saque (double valor) {
        double diferenca;
        if (valor > this.consultaSaldo() && valor <= this.consultaSaldo() + this.consultaLimite()) {
            diferenca = valor - this.consultaSaldo();
            this.saldoDevedor += diferenca;
            valor = this.consultaSaldo();
        }
        return super.saque(valor);
    }
    
    public double consultaLimite(){
        if (this.consultaSaldo() > 0.0) {
            return this.limite;
        }
        else{
            return this.limite - this.saldoDevedor;
        }
    }
}
