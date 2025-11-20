import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Userform extends Frame{
        static int count=0;

        Userform(){
            Label label=new Label("Name :");
            label.setBounds(500,150,100,30);

            TextField text=new TextField("");
            text.setBounds(600,150,100,30);

            Label password=new Label("Password :");
            password.setBounds(500,200,100,30);


            TextField pass=new TextField("");
            pass.setBounds(600,200,100,30);

            Label email=new Label("Email :");
            email.setBounds(500,250,100,30);

            TextField emailtext=new TextField("");
            emailtext.setBounds(600,250,100,30);

            Checkbox box=new Checkbox("male ");
            box.setBounds(600,300,100,50);
            Label gender=new Label("Gender");
            gender.setBounds(600,290,100,50);

            Choice choice=new Choice();
            choice.setBounds(600,350,100,50);
            choice.add("family");
            choice.add("friends");
            choice.add("enemy ");

            Button submit=new Button("Submit");
            submit.setBounds(530,400,100,30);

            ActionListener submit_2=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(text.getText());
                    System.out.println(pass.getText());
                    System.out.println(emailtext.getText());
                    System.out.println(gender.getText());
                    System.out.println(choice.getSelectedItem());

                    System.out.println("details "+ ++count +" time printed.");

                }
            };

            submit.addActionListener(submit_2);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

            add(label);
            add(text);
            add(password);
            add(pass);
            add(email);
            add(emailtext);
            add(box);
            add(gender);
            add(choice);
            add(submit);

            setLayout(null);
            setVisible(true);
            setSize(500,500);

            setTitle("mass machaa..");

        }
        public static void main(String[] args) {
            new Userform();
        }

}
