import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

    
    MyPanel panelMain;
    MyPanel panel1;
    MyPanel panel2;
    MyPanel panel3;
    // MyPanel infoPanelJeep;
    // MyPanel infoPanelHelicopter;
    // MyPanel infoPanelMotor;


    MyPanel heliPanel;
    MyPanel jeepPanel;
    MyPanel motoPanel;




    JLabel heliLabel = new JLabel();
    JLabel jeepLabel = new JLabel();
    JLabel motoLabel = new JLabel();
    // JLabel labelPic1 = new JLabel();
    // JLabel labelPic2 = new JLabel();
    // JLabel labelPic3 = new JLabel();

    JLabel infoLabelJeep = new JLabel();
    JLabel infoLabelHelicopter = new JLabel();
    JLabel infoLabelMotor = new JLabel();

    Image road;
    Image cars;
    Image helicopter;
    Image motor;




    public MyFrame(){

        



    }


    public void initUi(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

    





        






        this.pack();
        this.validate();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }





}
