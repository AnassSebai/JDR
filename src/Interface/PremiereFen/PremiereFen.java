import javax.swing.*;
import java.awt.*;

public class PremiereFen extends JFrame {
    public PremiereFen() {
        // Set the title of the window
        setTitle("My Game");

        // Set the size of the window
        setSize(800, 600);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Create a new menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a new menu
        JMenu fileMenu = new JMenu("Start Game");

        //create a second menu
        JMenu optionMenu = new JMenu("Options");
        //add the second menu to the menu bar
        menuBar.add(optionMenu);

        // Create a third menu
        JMenu helpMenu = new JMenu("Help");
        // Add the third menu to the menu bar
        menuBar.add(helpMenu);


        


        // Create a new menu item
        JMenuItem newMenuItem = new JMenuItem("New");
        

        // Center the text of the menu item
        newMenuItem.setHorizontalTextPosition(JMenuItem.CENTER);

        // Add the menu item to the menu
        fileMenu.add(newMenuItem);

        // Add the menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Create a new panel with the background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("background.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Set the panel as the content pane of the frame
        setContentPane(panel);

        // Add an action listener to the menu item
        newMenuItem.addActionListener(e -> {
            // Create a new frame
            JFrame newFrame = new JFrame("New Frame");

            // Set the size of the new frame
            newFrame.setSize(400, 300);

            // Set the default close operation for the new frame
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Center the new frame on the screen
            newFrame.setLocationRelativeTo(null);

            // Show the new frame
            newFrame.setVisible(true);
        });
    }
    
 public static void main(String[] args) {
        // Create a new instance of the PremiereFen class
        PremiereFen fen = new PremiereFen();

        // Show the window
        fen.setVisible(true);
    }

}
