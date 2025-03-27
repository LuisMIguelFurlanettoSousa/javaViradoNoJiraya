package academy.devDojo.maratonaJava.introducao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula3ExerciciosTipos {
    public static void main(String[] args) {
        String nome = "Luis";
        String endereco = "onde eu moro";
        float salario = 7000.50F;

        LocalDate dataAtual = LocalDate.now();
        String dataFormatadaSalario = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String relatorio = "Eu <"+nome+">, morando no endereço <"+endereco+">, " +
                "cofirmo que recebi o salario de R$ <"+salario+">, na data "+dataFormatadaSalario ;

        System.out.println(relatorio);
    }
}
