import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerguntaVisual extends JFrame {

    private Visual visual;

    public PerguntaVisual(Visual visual){
        this.visual = visual;
    }

    public void OnClick(ActionEvent e, boolean resposta){

        setVisible(false);
        visual.respondido(resposta);
    }

    public void iniciar()
    {
        setTitle("Orações Icásticas");
        setLayout(new BorderLayout(10, 5));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Title
        JPanel t = new JPanel();
        t.setLayout(new FlowLayout(FlowLayout.CENTER));
        t.add(new JLabel("Quem disse essa frase?"));

        // Question
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));

        Frase frase = visual.getLista().sortFrase();

        p.add(new JLabel(frase.getFrase()));

        // Buttons Panel
        // tonho lavínia gabriel lalic gigio antony ivan cabeça arruda

        JPanel b = new JPanel();
        JButton botaoTonho = new JButton("Tonho");
        botaoTonho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "tonho".equals(frase.getAutor()));
            }
        });
        b.add(botaoTonho);
        JButton botaoLavinia = new JButton("Lavínia");
        botaoLavinia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "lavinia".equals(frase.getAutor()));
            }
        });
        b.add(botaoLavinia);
        JButton botaoGabriel = new JButton("Gabriel");
        botaoGabriel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "gabriel".equals(frase.getAutor()));
            }
        });
        b.add(botaoGabriel);
        JButton botaoLalic = new JButton("Lalic");
        botaoLalic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "lalic".equals(frase.getAutor()));
            }
        });
        b.add(botaoLalic);
        JButton botaoGigio = new JButton("Gigio");
        botaoGigio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "gigio".equals(frase.getAutor()));
            }
        });
        b.add(botaoGigio);
        JButton botaoAntony = new JButton("Antony");
        botaoAntony.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "antony".equals(frase.getAutor()));
            }
        });
        b.add(botaoAntony);
        JButton botaoIvan = new JButton("Ivan");
        botaoIvan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "ivan".equals(frase.getAutor()));
            }
        });
        b.add(botaoIvan);
        JButton botaoCabeca = new JButton("Cabeça");
        botaoCabeca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "cabeça".equals(frase.getAutor()));
            }
        });
        b.add(botaoCabeca);
        JButton botaoArruda = new JButton("Arruda");
        botaoArruda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e, "arruda".equals(frase.getAutor()));
            }
        });
        b.add(botaoArruda);

        add(t, BorderLayout.PAGE_START);
        add(p, BorderLayout.CENTER);
        add(b, BorderLayout.PAGE_END);

        setMinimumSize(new Dimension(750, 200));

        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int coordX = (objDimension.width - getWidth()) / 2;
        int coordY = (objDimension.height - getHeight()) * 2/5;
        setLocation(coordX, coordY);

        this.setVisible(true);
    }
}
