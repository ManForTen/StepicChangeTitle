import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Первая надпись");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 1200, height = 800;
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        JPanel panel1 = new JPanel(), panel2 = new JPanel();
        JSlider slider = new JSlider(5, 100, 50);
        JLabel label = new JLabel("Надпись");
        label.setFont(new Font("Font", Font.ITALIC, 50));
        frame.add(panel1);
        panel1.setLayout(new GridBagLayout());
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setFont(new Font("Font", Font.ITALIC, slider.getValue()));
            }
        });
        frame.add(panel2, BorderLayout.SOUTH);
        panel1.add(label); // Добавляем надпись на первую панель (по центру)
        panel2.add(slider);//Добавляем слайдер на вторую панель (внизу)
        frame.setVisible(true);
    }
}