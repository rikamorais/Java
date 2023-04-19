package com.mycompany.heranca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rikam
 */
public class ContaCorrente {
    public double saldo;
    public int agencia;
    public double numeroConta;
    public String cliente;
    public String cpf;
    
//    MÉTODO CONSTRUTOR
    public ContaCorrente(int agencia, int numeroConta, String cliente, String cpf){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    
//    CONSULTA SALDO
    public double consultaSaldo(){
        return this.saldo;
    }
    
//    DEPÓSITO
    public double deposito(double valor){
        if (valor > 0.0) {
            this.saldo += valor;
        }
        else {
            System.out.println("Valor inválido para depósito!");
        }
        
//   MOSTRAR SALDO ATUALIZADO
        return this.saldo;
    }
    
//    SAQUE
    public double saque(double valor){
        if (valor > 0.0) {
            if (valor <= saldo) {
                this.saldo -= valor;
            }
            else {
                System.out.println("Valor inválido para saque!");
            }
        }
            return this.saldo;
    }
    
//    TRANFERÊNCIA
    public double transferencia(double valor, double outraConta){
        this.saque(valor);
//        outraConta.deposito(valor);
        return this.saldo;
    }
}
