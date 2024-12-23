public class Frase {

    private String frase;
    private String autor;

    public Frase() {
        this.frase = "";
        this.autor = "";
    }

    public Frase(String frase, String autor) {
        this.frase = frase;
        this.autor = autor;
    }

    public Frase copy() {
        return new Frase(this.frase, this.autor);
    }

    public String getFrase() {
        return frase;
    }
    public String getAutor() {
        return autor;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
