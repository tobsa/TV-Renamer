package tvrenamer;

import gui.MainFrame;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TVRenamer {
    public static void main(String[] args) {
//        File file = new File("Demons.mkv");
//        File copy = new File("Derpsons.mkv");
//        
//        InputStream  reader = new FileInputStream(file);
//        OutputStream writer = new FileOutputStream(copy);
//
//        byte[] buffer = new byte[1024];
//
//        int length;
//        while((length = reader.read(buffer)) > 0)
//            writer.write(buffer, 0, length);
//
//        reader.close();
//        writer.close();
//        System.out.println("Done!");
        
//        try {
//            File file = new File("Demons.mkv");
//            file.renameTo(new File("Derpsons.mkv"));
//            System.out.println("Done!");
//        } catch(Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        
        
        setLookAndFeel();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);             
            }
        });
    }
    
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
