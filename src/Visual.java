import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Visual {

    private Frases lista;
    private int pontos = 0;

    public Visual(Frases lista){
        this.lista = lista;
    }

    public void iniciar(){
        PerguntaVisual pergunta = new PerguntaVisual(this);
        pergunta.iniciar();
    }
    public void respondido(boolean resposta){
        if(resposta) acertou();
        else errou();
    }

    public void acertou(){
        pontos++;
        AcertoVisual acerto = new AcertoVisual(this);
        acerto.iniciar();
    }

    public void errou(){
        ErroVisual erro = new ErroVisual(this);
        erro.iniciar();
    }

    public Frases getLista() {
        return lista;
    }

    public void playSound(String soundFile) {
        File f = new File("./" + soundFile);
        AudioInputStream audioIn = null;
        try {
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        } catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        try {
            clip.open(audioIn);
        } catch (LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
        clip.start();
    }

    public int getPontos() {
        return pontos;
    }
}
