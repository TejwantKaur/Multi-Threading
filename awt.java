package multi;
import java.awt.*;

public class awt extends Frame{
    
    awt(){
        Button b = new Button("CLick Here");
        b.setBounds(30, 100, 80, 30);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        add(b);
    }

    public static void main(String[] args) {
    }
}
