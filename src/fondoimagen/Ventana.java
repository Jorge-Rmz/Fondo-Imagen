
package fondoimagen;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ActionListener {

    private JButton bAgregar, bQuitar;
    private JLabel lArea;

    public Ventana() {
        setTitle("Registro de datos");
        setBounds(0, 0, 550, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        lArea = new JLabel();
        lArea.setBounds(20, 70, 500, 500);
        add(lArea);

        bAgregar = new JButton("Mostrar Imagen");
        bAgregar.setBounds(120, 10, 140, 40);
        bAgregar.setVisible(true);
        add(bAgregar);
        bAgregar.addActionListener(this);
        
        bQuitar = new JButton("Quitar Imagen");
        bQuitar.setBounds(290, 10, 140, 40);
        bQuitar.setEnabled(false);
        add(bQuitar);
        bQuitar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAgregar ) {
            lArea.setIcon(new ImageIcon("src/fondoimagen/Imagen/fondo.gif"));
            add(lArea);
            bQuitar.setEnabled(true);
            bAgregar.setEnabled(false); 
        }
        
        if (e.getSource() == bQuitar ) {
             lArea.setIcon(null);
            add(lArea);
            bAgregar.setEnabled(true);
            bQuitar.setEnabled(false);
            
        }
    }

}
