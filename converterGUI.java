import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converterGUI extends JFrame{
    private JPanel mainpanel;
    private JTextField input;
    private JLabel Celcius;
    private JButton convertButton;
    private JLabel lablefaranihite;

    public converterGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.setSize(300,200);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //GRAB TEXT FROM TEXTBOX
                int temp_in_farh = (int)(Double.parseDouble(input.getText())*1.8+32);
                //SETTING VALUE
                lablefaranihite.setText(temp_in_farh + " Faranihite's");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new converterGUI("CONVERTOR");
        frame.setVisible(true);
    }
}
