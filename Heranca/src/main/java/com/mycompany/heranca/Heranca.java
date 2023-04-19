/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author rikam
 */
public class Heranca {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1234, 142536, "João", "135.792.468-00");
        ContaCorrente conta2 = new ContaCorrente(1234, 192837, "Maria", "864.297.531-00");
        
        double saldoAtual;
        saldoAtual = conta1.deposito(5000.0);
        System.out.println("João possui " + saldoAtual + " após depósito de R$5000,00");
        
        saldoAtual = conta2.deposito(1000.0);
        System.out.println("Maria possui " + saldoAtual + " após saque de R$1000,00");
        
        saldoAtual = conta1.transferencia(2500.0, conta1.transferencia(2500.00, conta2.numeroConta));
        System.out.println("João possui " + saldoAtual + " após tranferir R$2500,00");
        
        saldoAtual = conta2.consultaSaldo();
        System.out.println("Maria ficou com: " + saldoAtual);
        
        saldoAtual = conta1.saque(2550.0);
        System.out.println("João sacou e ficou com " + saldoAtual);
    
//        --------------------------------------------------
//Verificando se um objeto pertence a tal classe.
    //    instanceof

        ContaEspecial conta3 = new ContaEspecial(1234, 14256, "João", "135.792.468-00", 1000.0);
        ContaCorrente conta4 = new ContaCorrente(1925, 32752, "Maria", "864.297.531-00");

        if (conta3 instanceof ContaEspecial) {
                System.out.println("conta3 é Conta Especial.");

        }
        else{
                System.out.println("conta3 não é Conta Especial.");
        }
        if (conta3 instanceof ContaCorrente) {
            System.out.println("conta3 é Conta Corrente.");
        }
        else {
            System.out.println("cont3 não é Conta Corrente");
        }
        
        if (conta4 instanceof ContaEspecial) {
            System.out.println("conta4 é Conta Especial.");
        }
        else {
            System.out.println("conta4 não é Conta Especial.");
        }
        if (conta4 instanceof ContaCorrente) {
            System.out.println("conta4 é Conta Corrente.");
        }
        else {
            System.out.println("conta4 não é Conta Corrente.");
        }
    }
    
        
        
}
