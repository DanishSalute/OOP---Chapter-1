import java.awt.*;
import javax.swing.*;
import javafx.scene.control.ComboBox;

public class Main extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JButton plainButton;
    private JTextArea Textbox1;
    private JRadioButton b1, b2, b3;
    @SuppressWarnings("rawtypes")
    private JComboBox Combobox;

    

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Main(){
        super("testing JLabel");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("Label with text");
        container.add(label1);
        setSize(275,200);
        setVisible(true);

        /*Icon rabbit = new ImageIcon("Pikachu.gif");
        label2 = new JLabel("Pikachu", rabbit,SwingConstants.LEFT);
        label2.setToolTipText("This is an animated rabbit");
        container.add(label2);*/

        plainButton = new JButton("Plain Button");
        container.add(plainButton);

        
        Textbox1 = new JTextArea ("Multiple line");
        Textbox1.setSize(100,200);
        Textbox1.setLocation(20,20);
        Textbox1.setBackground(Color.PINK);
        Textbox1.setForeground(Color.DARK_GRAY);
        Textbox1.setFont(new
        Font("Tahoma",Font.TRUETYPE_FONT,16));
        add(Textbox1);

        ButtonGroup group1 = new ButtonGroup();
        b1 = new JRadioButton("Hagen Dazz");
        b2 = new JRadioButton("Basken Robin");
        b3 = new JRadioButton("Walls");
        group1.add(b1);
        group1.add(b2);
        group1.add(b3);
        container.add(b1);
        container.add(b2);
        container.add(b3);

        String names[]= {"Pikachu.gif"};
        Combobox = new JComboBox(names);
        Combobox.setMaximumRowCount(3);
        Combobox.setBounds(50,50,100,20);
        container.add(Combobox);

        cb1 = new JCheckBox("C");
        cb2 = new JCheckBox("JAVA");
        c1.setBounds(20,20,200,50);
        c2.setBounds(20,70,200,50);

        add(c1);
        add(c2);

    }   
    public static void main(String[] args) {
        Main application = new Main();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}