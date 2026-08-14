import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBounds(20,20, 150, 25);

        JButton button = new JButton("Click Me");
        button.setBounds(180, 20, 90, 25);

        JLabel label = new JLabel("Hello!");
        label.setBounds(20, 60, 250, 25);

        // for (int i = 0; i < 3; i++) {
        //     JCheckBox check = new JCheckBox();
        //     check.setBounds(20, 100, 30, 25);
        //     JLabel label2 = new JLabel("");
        //     label2.setBounds(50, 100, 250, 25);
        // }

        frame.add(textField);
        frame.add(button);
        frame.add(label);
        // frame.add(check);
        // frame.add(label2);

        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });
    }
}
