import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageOperation{

    public static void operate(int key){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        //file input stream reader
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i = 0;
            for (byte b : data) {
              //  System.out.println(b);
                data[i]=(byte)(b^key);
                i++;
            }

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");

        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       
        JFrame f = new JFrame();
        f.setTitle("Image Opeartion");
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Roboto",Font.BOLD,25);

        JButton button = new JButton();
        button.setText("Open Image");
        button.setFont(font);

        JTextField textField = new JTextField(10);
        textField.setFont(font);

        
        button.addActionListener(e->{
            System.out.println("Inside button");
            String text = textField.getText();
            int temp = Integer.parseInt(text);
            operate(temp);
        });


        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);

        f.setVisible(true);

    }
}