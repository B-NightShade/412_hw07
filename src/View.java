import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    static JTextField jTextField = new JTextField(20);

    public static void main() {
        JPanel myPanel = new JPanel();
        myPanel.add(jTextField);
        JButton add = new JButton("add");

        add.addActionListener(new Controller.addButtonAL());
        myPanel.add(add);
        JButton del = new JButton("Delete");
        JFrame jFrame = new JFrame();
        jFrame.add(BorderLayout.NORTH, myPanel);
        jFrame.add(BorderLayout.SOUTH, del);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
    }
        void setAddActionListener (ActionListener al){

        }

        String getInputText () {
            String input = jTextField.getText();
            return input;
        }

}
