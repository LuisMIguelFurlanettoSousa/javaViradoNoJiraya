package academy.devDojo.maratonaJava.Javacore.Aintroducaoclasses.teste;

import academy.devDojo.maratonaJava.Javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Algum professor";
        professor.idade = 30;
        professor.sexo ='M';

        System.out.println("nome: " + professor.nome + " idade: " +professor.idade + " sexo: " + professor.sexo);
    }
}
