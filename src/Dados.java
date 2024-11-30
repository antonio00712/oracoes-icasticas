import java.io.FileReader;


public class Dados {

    public void getDados(Frases lista) {
        // extract the data from the tsv file to an array of frase
        try {
            FileReader fileReader = new FileReader("mensagens.tsv");

            int c;
            int j = 0;
            StringBuilder atual = new StringBuilder();
            Frase frase = new Frase();
            while ((c = fileReader.read()) != -1) {
                if(c == '\t'){
                    if(j == 0){
                        j = 1;
                        frase.setFrase(atual.toString());
                    }
                    else{
                        j = 0;
                        frase.setAutor(atual.toString());
                        lista.addFrase(frase.copy());
                    }
                    atual = new StringBuilder();
                }else{
                    if(atual.length() <= 1 & (char)c == '\n') continue;
                    atual.append((char)c);
                }
            }

            fileReader.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
