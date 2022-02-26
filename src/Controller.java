import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller{
    static View v1 = new View();
    static Model m1 = new Model();
    public void go() {
        v1.main();
    }

    static class addButtonAL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = v1.getInputText();
            System.out.println(input);
            m1.addData(input);
            String word = m1.getdata();
            v1.addListdata(word);

        }
    }



}
