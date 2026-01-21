package StreamsELambdas.ex01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java8LambdaActionListener {
    public static void main(String[] args) {

        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Olá mundo!");
            }
        });

        JButton jButton2 = new JButton();
        jButton2.addActionListener(e -> System.out.println("Olá mundo!"));

        //SAM - Single Abstract Method
        //Qualquer interface que tenha apenas um método abstrato.

    }
}
