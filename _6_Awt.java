package multi;
import java.awt.*;

public class _6_Awt extends Frame{

    _6_Awt(){
        Label l = new Label("EEC");
        l.setText("EEC Classes");
        add(l);
        l.getText();
        
        TextField t = new TextField(10);
        t.setText("Hello World");


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
