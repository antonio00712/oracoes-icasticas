import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();
        Frases listaFrases = new Frases(300);
        dados.getDados(listaFrases);
        Frase teste = listaFrases.sortFrase();
        Frase teste2 = listaFrases.sortFrase();
        System.out.println(teste.getFrase());
        Scanner input = new Scanner(System.in);
        String resposta = input.next();
        if(Objects.equals(resposta, teste.getAutor())) {
            System.out.println("acertou!");
        }else {
            System.out.println("errou! o correto era:");
            System.out.println(teste.getAutor());
        }
        //listaFrases.printFrases();
        input.close();
    }
}