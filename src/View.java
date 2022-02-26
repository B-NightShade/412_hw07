import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    static JTextField jTextField = new JTextField(20);
    static DefaultListModel<String> listmodel = new DefaultListModel<>();
    static JList<String> list = new JList<String>(listmodel);

    public static void main() {
        JPanel myPanel = new JPanel();
        myPanel.add(jTextField);
        JButton add = new JButton("add");

        add.addActionListener(new Controller.addButtonAL());
        myPanel.add(add);
        JButton del = new JButton("Delete");
        JFrame jFrame = new JFrame();
        jFrame.getContentPane().add(BorderLayout.NORTH, myPanel);
        jFrame.getContentPane().add(BorderLayout.SOUTH, del);
        jFrame.getContentPane().add(BorderLayout.CENTER, list);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
    }

        String getInputText () {
            String input = jTextField.getText();
            return input;
        }

        void addListdata(String item){
            listmodel.addElement(item);
        }

}
