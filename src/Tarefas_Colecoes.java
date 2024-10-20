import java.util.Arrays;
import java.util.Scanner;

public class Tarefas_Colecoes {
    public static void main(String[] args) {
        NomesOrdemAlfabetica();
        NomesPorGrupo();
    }

    public static void NomesOrdemAlfabetica() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = s.nextLine();

        String[] nomes = entrada.split(",");

        Arrays.sort(nomes);

        System.out.println(" ");
        System.out.println( "-------------------------------- ");

        System.out.println("   Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println("            "+nome);
        }

        System.out.println( "-------------------------------- ");
        System.out.println(" ");

        s.close();
    }

    public static void NomesPorGrupo() {
        String[] pessoas = { "Daniel-Masculino", "Bruna-Feminino", "Kainan-Masculino", "Gabi-Feminino" };
        String[] homens = new String[pessoas.length];
        String[] mulheres = new String[pessoas.length];

        int Homens = 0;
        int Mulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {

            String[] partes = pessoas[i].split("-");
            String nome = partes[0];
            String sexo = partes[1];

            if (sexo.equalsIgnoreCase("Masculino")) {
                homens[Homens] = nome;
                Homens++;
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                mulheres[Mulheres] = nome;
                Mulheres++;
            }
        }
        System.out.println(" ");
        System.out.println( "-------------------------------- ");

        System.out.println("            Homens:");
        for (int i = 0; i < Homens; i++) {
            System.out.println("            " + homens[i]);
        }

        System.out.println(" ");

        System.out.println("           Mulheres:");
        for (int i = 0; i < Mulheres; i++) {
            System.out.println("            " + mulheres[i]);
        }

        System.out.println("-------------------------------- ");
        System.out.println(" ");
    }
}