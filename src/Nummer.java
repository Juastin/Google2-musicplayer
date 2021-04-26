import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Nummer extends JFrame implements ActionListener {
    private JButton nummer1;
    private JButton nummer2;
    private int nummer=0;
    private int pause=0;

    public Nummer(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 300);
        this.setLayout(new FlowLayout());
        setTitle("Speler");
        nummer1 = new JButton("BloodyTears");
        nummer2 = new JButton("Ander nummer");
        nummer1.addActionListener(this);
        nummer2.addActionListener(this);
        add(nummer1);
        add(nummer2);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Alleliedjes liedjes = new Alleliedjes();
        if(e.getSource()== nummer1){
            try {
                Muziek nummer1 = new Muziek(liedjes.getNummer1());
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if(e.getSource()==nummer2){
            try {
                Muziek nummer1 = new Muziek(liedjes.getBloodytears());
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
