import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Menu {

  private Usuario usuario = new Usuario();
  
  public Menu() {
    titulo();
  }
  
  public void titulo() {
    JFrame pantalla = new JFrame("SAM");
    pantalla.setSize(500,300);
    pantalla.setVisible(true);
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel(); 
    
    //Agregar una imagen.
    JLabel imagenLabel = new JLabel();
   
    ImageIcon icono = new ImageIcon("logo.jpg");
    Image imagen = icono.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH);
    icono = new ImageIcon(imagen);
    imagenLabel.setIcon(icono);

    JLabel pregunta = new JLabel("BIENVENIDO A SAM");
    JButton bt1 = new JButton("INICIAR");
    
    panel.add(imagenLabel);
    panel2.add(pregunta);
    panel2.add(bt1);

    pantalla.setLayout(new BorderLayout());

    pantalla.add(panel, BorderLayout.NORTH);
    pantalla.add(panel2, BorderLayout.CENTER);

    bt1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        usuario.setTitulo("INICIAR");
        pregunta();

      }

    });
  }
  
    
  public void pregunta() {
    JFrame pantalla = new JFrame("SAM");
    pantalla.setSize(500,300);
    pantalla.setVisible(true);
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel(); 
      
    JLabel pregunta = new JLabel("¿Tienes mascotas?");
    JButton bt1 = new JButton("Si");
    JButton bt2 = new JButton("No");
    
    panel.add(pregunta);
    panel2.add(bt1);
    panel2.add(bt2);

    pantalla.setLayout(new BorderLayout());
    
    pantalla.add(panel, BorderLayout.NORTH);
    pantalla.add(panel2, BorderLayout.CENTER);
    
    bt1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        usuario.setMascota(true);
        pregunta2();

      }

    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setMascota(false);
          pregunta2();
        }
    });
  }

  
  public void pregunta2() {
    JFrame pantalla = new JFrame("SAM");
    pantalla.setSize(500,300);
    pantalla.setVisible(true);
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel pregunta = new JLabel("¿Tienes alergias?");
    JButton bt1 = new JButton("Si");
    JButton bt2 = new JButton("No");

    panel.add(pregunta);
    panel2.add(bt1);
    panel2.add(bt2);

    pantalla.setLayout(new BorderLayout());

    pantalla.add(panel, BorderLayout.NORTH);
    pantalla.add(panel2, BorderLayout.CENTER);

    bt1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        usuario.setAlergia(true);
        pregunta3();
      }

    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setAlergia(false);
          pregunta3();
        }
    });
  }

  
  public void pregunta3() {
    JFrame pantalla = new JFrame("SAM");
    pantalla.setSize(500,300);
    pantalla.setVisible(true);
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel pregunta = new JLabel("¿Cúal es tu tipo de vivienda?");
    JButton bt1 = new JButton("Apartamento");
    JButton bt2 = new JButton("Casa");
    JButton bt3 = new JButton("Finca");

    panel.add(pregunta);
    panel2.add(bt1);
    panel2.add(bt2);
    panel2.add(bt3);

    pantalla.setLayout(new BorderLayout());

    pantalla.add(panel, BorderLayout.NORTH);
    pantalla.add(panel2, BorderLayout.CENTER);

    bt1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        usuario.setVivienda("Apartamento");
        pregunta4();
      }

    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setVivienda("Casa");
          pregunta4();
        }
    });
    bt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setVivienda("Finca");
          pregunta4();
        }
    });
    }


  
  public void pregunta4() {
    JFrame pantalla = new JFrame("SAM");
    pantalla.setSize(500,300);
    pantalla.setVisible(true);
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel pregunta = new JLabel("¿En que época del año te encuentras?");
    JButton bt1 = new JButton("Primavera");
    JButton bt2 = new JButton("Otoño");
    JButton bt3 = new JButton("Invierno");
    JButton bt4 = new JButton("Verano");

    panel.add(pregunta);
    panel2.add(bt1);
    panel2.add(bt2);
    panel2.add(bt3);
    panel2.add(bt4);

    pantalla.setLayout(new BorderLayout());

    pantalla.add(panel, BorderLayout.NORTH);
    pantalla.add(panel2, BorderLayout.CENTER);

    bt1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        usuario.setVivienda("Primavera");
      }

    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setVivienda("Otoño");
        }
    });
    bt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setVivienda("Invierno");
        }
    });
    bt4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usuario.setVivienda("Verano");
        }
    });

  }


  
}
