import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ErroVisual extends JFrame {

    private Visual visual;

    public ErroVisual(Visual visual){
        this.visual = visual;
    }

    public void OnClick(ActionEvent e){
        setVisible(false);
        visual.playSound("novaPergunta.wav");
        visual.iniciar();
    }

    public void iniciar(){
        visual.playSound("errou.wav");

        setTitle("Orações Icásticas");
        setLayout(new BorderLayout(10, 5));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Score
        JPanel pnt = new JPanel();
        pnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnt.add(new JLabel(String.format("Pontos: %d", visual.getPontos()) ));

        // Image
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("errou.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));

        JPanel b = new JPanel();
        JButton botaoProximo = new JButton("Próxima frase");
        botaoProximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(e);
            }
        });
        b.add(botaoProximo);

        add(pnt, BorderLayout.PAGE_START);
        add(b, BorderLayout.PAGE_END);
        add(picLabel);

        setMinimumSize(new Dimension(1000, 800));

        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int coordX = (objDimension.width - getWidth()) / 2;
        int coordY = (objDimension.height - getHeight()) * 2/5;
        setLocation(coordX, coordY);

        setVisible(true);
    }
}
