import java.io.FileReader;


public class Dados {

    // n sei se é uma boa usar vetor normal ve ai

    public void obterDados() {

        try {
            Frase frase = new Frase("Essa bolinha girando, é um tesão", "antony");
            FileReader fileReader = new FileReader("mensagens.tsv");

            int c;
            int i = 0, j = 0;
            while ((c = fileReader.read()) != -1) {
                if(c == '\t'){
                    if(j == 0){
                        j = 1;
                    }
                    else{
                        j = 0;
                        i++;
                    }
                }
            }

            fileReader.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

}
