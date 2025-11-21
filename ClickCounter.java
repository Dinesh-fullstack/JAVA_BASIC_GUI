import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;

public class ClickCounter extends Frame{

        static int count=0;
        ClickCounter(){
            Label label = new Label("Click Counter");
            label.setBounds(200, 50, 200, 210);
            label.setFont(new Font("Serif", Font.BOLD, 24));
            add(label);

            TextField display=new TextField(" "+count+" ");
            display.setBounds(200,300,100,30);
            Button increse=new Button("+");
            increse.setBounds(350,300,50,30);

            ActionListener incer=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = ++count;
                    display.setText(String.valueOf(i));
                }
            };

            increse.addActionListener(incer);

            Button decrese=new Button("-");
            decrese.setBounds(100,300,50,30);

            ActionListener decre=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int j=--count;
                    display.setText(String.valueOf(j));
                }
            };
            decrese.addActionListener(decre);

            Button reset=new Button("Reset");
            reset.setBounds(200,400,100,30);

//        action listener

            ActionListener re=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count=0;
                    display.setText(String.valueOf(count));
                }
            };
            reset.addActionListener(re);

//  window  listener

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

            add(display);
            add(increse);
            add(decrese);
            add(reset);

            setLayout(null);
            setVisible(true);
            setSize(500,500);
        }

        public static void main(String[] args) {
            new ClickCounter();
        }

}
