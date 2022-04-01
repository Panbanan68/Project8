package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton кнопка = new JButton("Запуск");
    private JTextField введите = new JTextField("", 5);
    private JLabel label = new JLabel("Введите:");
    private JRadioButton точка1 = new JRadioButton("Выберите это");
    private JRadioButton точка2 = new JRadioButton("Выберите вот это");
    private JCheckBox проверка = new JCheckBox("Проверено", false);

    public SimpleGUI () {
        super("Первый пример");
        this.setBounds(200, 200, 350, 130);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(введите);

        ButtonGroup group = new ButtonGroup();
        group.add(точка1);
        group.add(точка2);
        container.add(точка1);
        точка1.setSelected(true);
        container.add(точка2);
        container.add(проверка);
        кнопка.addActionListener(new ButtonEventListener ());
        container.add(кнопка);


    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Кнопка Запуск была нажата\n";
            message += "Текст " + введите.getText() +"\n";
            message += (точка1.isSelected() ? "Точка 1 " : "Точка 2 ") + "выбрана!\n";
            message += "Проверка галочки " + (((проверка.isSelected())) ? "- поставлена" : "- не поставлена");
            JOptionPane.showMessageDialog(null,message, "Output" , JOptionPane.PLAIN_MESSAGE);

        }
    }
}
