import java.util.Random;

public class Frases {
    // Dynamic array of Frase

    private Frase[] frases;
    private int count = 0;

    public Frases(int size){
        frases = new Frase[size];
    }

    public void addFrase(Frase frase){
        if (frases.length == count) {

            Frase[] newArr = new Frase[2 * count];

            System.arraycopy(frases, 0, newArr, 0, count);

            // Assigning new array to original array
            frases = newArr;
        }

        frases[count++] = frase;
    }

    public Frase sortFrase(){
        Random gerador = new Random();
        return frases[gerador.nextInt(count)].copy();
    }

    public void printFrases(){
        for (int i = 0; i < count; i++)
            System.out.print(frases[i].getFrase() + "***" + frases[i].getAutor() + "***\n");
    }
}
