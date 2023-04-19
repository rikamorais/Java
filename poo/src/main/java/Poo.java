/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author rikam
 */
public class Poo {

    public static void main(String[] args) {
        
        System.lineSeparator();
        
        Aluno aluno1 = new Aluno ();
        
        aluno1.nome = "Paula";
        aluno1.matricula = "200509135";
        aluno1.endereco = "Rua da Alegria";
        aluno1.telefone = "11991252509";
        aluno1.email = "paulamelo@gmail.com";
        
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Endereço: " + aluno1.endereco);
        System.out.println("Telefone: " + aluno1.getTelefone());
        System.out.println("E-mail: " + aluno1.getEmail());
        
    }
}
