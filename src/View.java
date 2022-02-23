import javax.swing.*;
import java.awt.*;

public class View {
    public void main() {
        JPanel myPanel = new JPanel();
        JTextField jTextField = new JTextField(20);
        myPanel.add(jTextField);
        myPanel.add(new JButton("add"));
        JButton del = new JButton("Delete");
        JFrame jFrame = new JFrame();
        jFrame.add(BorderLayout.NORTH, myPanel);
        jFrame.add(BorderLayout.SOUTH, del);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
    }
}
