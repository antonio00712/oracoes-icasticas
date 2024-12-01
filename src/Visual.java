
public class Visual {

    private Frases lista;

    public Visual(Frases lista){
        this.lista = lista;
    }

    public void iniciar(){
        PerguntaVisual pergunta = new PerguntaVisual(this);
        pergunta.iniciar();
    }
    public void respondido(boolean resposta){
        if(resposta){

        }
    }

    public Frases getLista() {
        return lista;
    }
}
